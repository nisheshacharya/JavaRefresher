package javaClass.interface_;

class Triangle implements Shape, Angles {

    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3){

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getBase() {
        return base;
    }

    protected double getSide1() {
        return side1;
    }

    protected double getSide2() {
        return side2;
    }

    protected double getSide3() {
        return side3;
    }

    @Override
    public double calculateArea() {
        double s = (calculatePerimeter()/2);
        return Math.sqrt((s*(s-side1)*(s-side2)*(s-side3)));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double sumOfInternalAngles() {
        return 180;
    }
}