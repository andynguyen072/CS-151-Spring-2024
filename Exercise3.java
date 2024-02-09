/*
 * Exercise 3
 * 
 * Create a class Shape with attributes length and width
 * 
 * Create class Rectangle which extends class Shape with additional attribute area
 * 
 * Have constructor of rectangle class intialise all 3 values with 2 of its values intialized using super() keyword
 * 
 * Create another class with main method which creates the objects of both Rectangle and Shape class.
 */

 class Shape{
    double length, width;

    Shape(double l, double w){
        
        System.out.println("Shape");
    }

    double getPeri(){
        System.out.println("Inside Shape");
        return length*2 + width*2;
    }
 }

 class Rectangle extends Shape{
    double area;

    // Rectangle(){
    //     area = super.length * super.width;
    // }

    Rectangle(double l, double w){
        super(l, w);
        area = l * w;
        System.out.println("Rectangle");
    }

    double getPeri(){
        System.out.println("Inside Rectangle");
        double result = super.getPeri();
        return result;
    }
 }

 class Square extends Rectangle{
    Square(double l, double w){
        super(l, w);
        System.out.println("Square");
    }

    double getPeri(){
        System.out.println("Inside Square");
        double result = super.getPeri();
        return result;
    }
 } 

 class Exercise3{
    public static void main(String[] args){
        // Rectangle myRectangle = new Rectangle(5, 6);
        // Shape myShape = new Shape(4, 5);
        Square mySquare = new Square(2, 4);

        //myShape.getPeri();
        mySquare.getPeri();

        //System.out.println(myRectangle.area);
    }
 }