package javaClass.inheritance;

public class Main {
    public static void main(String[] args) {
        Developer d1 = new Developer("John", 100000, true);
        System.out.println(d1.calculateBonus(3, true));
    }
}
