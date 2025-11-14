public class FullTimeEmployee  extends Employee{
    protected int montSal;
    EmployeeType tp = EmployeeType.FULL_TIME;

    public FullTimeEmployee(String name, int montSal){
        super(name);
        this.montSal = montSal;

    }


    public double calculatePay() {
        return this.montSal;
    }

    public void getDetails(){
        System.out.println("Employee: " + this.name + ", sallary: " + calculatePay());
    }
}
