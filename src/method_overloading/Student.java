package method_overloading;

public class Student {
   private int id;
   private String name;
   private String major;

    Student(int id, String name, String major){
        this.id = id;
        this.name = name;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade(double percentage){
        String grade;

        int percent = (int) percentage;

        switch (percent / 10) {
            case 10: // For percentage == 100
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
                break;
        }

        return grade;
    }

    public String getGrade(double firstSemMarks, double secondSemMarks){
        String grade;
        double doublePercentage = (firstSemMarks + secondSemMarks)/2;
        int percent = (int) doublePercentage;

        switch (percent / 10) {
            case 10: // For percentage == 100
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
                break;
        }
        return grade;
    }
}
