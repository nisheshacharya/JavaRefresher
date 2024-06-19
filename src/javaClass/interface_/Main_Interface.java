package javaClass.interface_;

public class Main_Interface {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(15, 5);
        Triangle t1 = new Triangle(5, 5,6);

        double r1_area = r1.calculateArea();
        double r1_perimeter = r1.calculatePerimeter();
        double t1_area = t1.calculateArea();
        double t1_perimeter = t1.calculatePerimeter();

        System.out.println("Length:" + r1.getLength()+"  Breadth:" + r1.getBreadth()+"  Area:" +r1_area);
        System.out.println("Length:" + r1.getLength()+"  Breadth:" + r1.getBreadth()+"  Perimeter:"+ r1_perimeter);
        System.out.println( "Area of triangle is:"+ t1_area);
        System.out.println("Perimeter of triangle t1 is "+ t1_perimeter);
    }
}
