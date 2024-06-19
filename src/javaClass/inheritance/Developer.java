package javaClass.inheritance;

public class Developer extends Employee{
    private boolean isPermanent;
    public Developer( String name, double salary, boolean isPermanent) {
        super(name, salary);
        this.isPermanent = isPermanent;
    }


    public boolean isPermanent() {
        return isPermanent;
    }

    public void setPermanent(boolean permanent) {
        isPermanent = permanent;
    }

    // Method overriding
    public void getDetails(){
        String name = getName();
        double salary = getSalary();
        boolean permanentStatus = isPermanent();
        String employeeType = (isPermanent()? "Permanent": "Temporary");

        System.out.println("Name: " + name + "  Salary: " + salary + " Employee type: "+ employeeType);

    }

    public double calculateBonus(int yearsInService, boolean isVeteran){
        return (yearsInService*100 + (isVeteran? (getSalary() *0.1): 0));
    }
}
