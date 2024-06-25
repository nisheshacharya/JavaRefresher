package revision;

class Student {
    String name;
    int id;
    double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public void study() {
        System.out.println(name + " is studying.");
    }
}


class GraduateStudent extends Student {
    String major;

    public GraduateStudent(String name, int id, double gpa, String major) {
        super(name, id, gpa);
        this.major = major;
    }

    public void graduate() {
        System.out.println(name + " is graduating with a major in " + major);
    }
}

public class Main {
    public static void main(String[] args) {
        GraduateStudent gradStudent = new GraduateStudent("Ram", 1234, 3.63, "CS");

        gradStudent.study();
        gradStudent.graduate();

        Student student = (Student) gradStudent;
        student.study();
    }
}