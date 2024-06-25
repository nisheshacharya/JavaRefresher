package method_overloading;

public class StudentMain {

    public static void main(String[] args) {
        Student s1 = new Student(101, "Suresh", "Computer Science");
        Student s2 = new Student(101, "Ramesh", "Computer Science");

        String sureshGrade = s1.getGrade(90);
        String rameshGrade = s2.getGrade(91.5, 75.2);
        System.out.println("Suresh's grade: "+  sureshGrade);
        System.out.println("Ramesh's grade: "+  rameshGrade);

        System.out.println("-------------------------------------");
        System.out.println("Before changing name: ");
        System.out.println(s1.getName());
        s1.setName("Himesh");

        System.out.println("After setting name");
        System.out.println(s1.getName());


    }



}
