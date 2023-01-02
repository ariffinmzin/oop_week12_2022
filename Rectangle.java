public class Rectangle extends GeometricObject {

    private String name;

    //method overriding

    public void calculateArea(){

        //System.out.println("This function is used to calculate an area of a geometric object");
        setHeight(2);
        setLength(2);
        System.out.println("The area of rectangle is " + getLength() * getHeight());
    }

    public void calculatePerimeter(){

        setHeight(2);
        setLength(2);
        System.out.println("The perimeter of rectangle is " + (getLength() + getLength() + getHeight() + getHeight()));
    }

    //method overloading
    public void calculatePerimeter(double h, double w){

        setHeight(2);
        setLength(2);
        System.out.println("The perimeter of rectangle is " + (getLength() + getLength() + getHeight() + getHeight()));
    }

    //method overloading
    public void calculatePerimeter(double h, double w, double x){

        setHeight(2);
        setLength(2);
        System.out.println("The perimeter of rectangle is " + (getLength() + getLength() + getHeight() + getHeight()));
    }

    //method overloading
    public double calculatePerimeter(double h, double w, double x, double y){

        setHeight(2);
        setLength(2);
        //System.out.println("The perimeter of rectangle is " + (getLength() + getLength() + getHeight() + getHeight()));
        return (getLength() + getLength() + getHeight() + getHeight());
    }

    //overwrite toString() from Object class
    public String toString(){

        return "This is a rectangle class";


    }



    public static void main(String args[]){

        Rectangle r1 = new Rectangle();
        //r1.calculateArea();
        //r1.calculatePerimeter();
        //System.out.println(r1.toString()); //A-F and 0-9
        r1.length=10;
        System.out.println(r1.length);
    }




    
}
