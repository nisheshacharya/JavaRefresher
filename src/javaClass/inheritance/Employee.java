package javaClass.inheritance;

public class Employee {
    private double salary;
    private String name;
    private boolean isPermanent;

//    Constructor
    public Employee( String  name, double salary){
        this.salary = salary;
        this.name = name;

    }

    //    Getters and setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getDetails(){
        String name = getName();
        double salary = getSalary();
        System.out.println("Name: " + name + "  Salary: " + salary);
    }
    public int calculateBonus(int yearsInService){
        return 1000*yearsInService;
    }
}
