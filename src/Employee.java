abstract class Employee implements Payable{
    protected String name;
    protected double payment;

    public Employee(String name){
        this.name = name;
    }

    public double calculatePay(){
        return payment;
    }

    abstract void getDetails();
}
