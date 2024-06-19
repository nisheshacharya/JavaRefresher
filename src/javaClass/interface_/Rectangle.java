package javaClass.interface_;

class Rectangle implements Shape, Angles{

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    protected  double getLength(){
        return  this.length;
    }
    protected  double getBreadth(){
        return this.breadth;
    }

    @Override
    public double calculateArea() {
        return length* breadth;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(length + breadth);
    }
    @Override
    public double sumOfInternalAngles(){
        return 360;
    }
}