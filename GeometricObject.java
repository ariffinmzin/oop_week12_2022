public class GeometricObject{

    //private double length;
    protected double length;
    private double height;

    //setters
    public void setLength(double length){
        this.length = length;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setLengthAndHeight(double length, double height){
        this.length = length;
        this.height = height;
    }

    //getters
    //solidity
    public double getLength(){
        return length;
    }

    public double getHeight(){
        return height;
    }

    public void calculateArea(){

        System.out.println("This function is used to calculate an area of a geometric object");
    }

}