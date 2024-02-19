interface A{
	default void display(){
	System.out.println("Displaying the entered values in A");
	}
}

interface B{
	default void display(){
	System.out.println("Displaying the entered values in B");
	}

}

class C{
	public void display(){
	System.out.println("Displaying the entered values in C");
	}
}

class ABC extends C implements A, B{

	public void display(){
	System.out.println("Displaying the entered values in ABC");
	A.super.display();
	B.super.display();
	super.display();
	}
	
	public static void main(String args[]){
		ABC b = new ABC();
		b.display();
	}
}