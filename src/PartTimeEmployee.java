public class PartTimeEmployee extends Employee{
    protected int hourRate;
    protected int hoursWorked;
    EmployeeType tp = EmployeeType.PART_TIME;

    public PartTimeEmployee(String name, int hourRate, int hoursWorked){
        super(name);
        this.hourRate = hourRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculatePay(){
        return this.hoursWorked*this.hourRate;
    }

    public void getDetails(){
        System.out.println("Employee: " + this.name + ", sellery: " + calculatePay());
    }
}
