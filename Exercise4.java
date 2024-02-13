class Figure{
    int dim1;
    int dim2;

    Figure(int a, int b){
        dim1 = a;
        dim2 = b;
    }

    int findArea(){
        System.out.println("Inside Figure");
        return 0;
    }
}

class Rectangle extends Figure{
    Rectangle(int a, int b){
        super(a, b);
    }

    int findArea(){
        System.out.println("Inside Rectangle");
        return dim1 * dim2;
    }
}

class Triangle extends Figure{
    Triangle(int a, int b){
        super(a, b);
    }

    int findArea(){
        System.out.println("Inside Triangle");
        return (dim1 * dim2)/2;
    }
}

public class Exercise4 {
    public static void main(String[] args){
        Figure myFigure = new Figure(1, 8);
        Rectangle myRectangle = new Rectangle(7, 4);
        Triangle myTriangle = new Triangle(5, 4);

        Figure theRectangle = myRectangle;
        System.out.println(theRectangle.findArea());
        
        Figure theTriangle = myTriangle;
        System.out.println(theTriangle.findArea());
        //System.out.println(myTriangle.findArea());
    }
}
