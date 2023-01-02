public class Triangle extends GeometricObject {

    public void calculateArea(){

        //System.out.println("This function is used to calculate an area of a geometric object");
        setHeight(2);
        setLength(2);
        System.out.println("The area of triangle is " + 0.5 * getLength() * getHeight());
    }

    public static void main(String args[]){

        Triangle t1 = new Triangle();
        t1.calculateArea();
    }

    
}
