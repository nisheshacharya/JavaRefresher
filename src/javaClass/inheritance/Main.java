package javaClass.inheritance;

public class Main {
    public static void main(String[] args) {
        Developer d1 = new Developer("John", 100000, true);
        JavaDeveloper j1 = new JavaDeveloper("Doe", 120000, true, 5);

        
        System.out.println(d1.calculateBonus(3, true));
        System.out.println(j1.calculateBonus(1,true ));
        j1.getDetails();
    }
}
