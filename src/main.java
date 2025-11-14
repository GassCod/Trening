import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        emps.add(new FullTimeEmployee("Petr",100));
        emps.add(new PartTimeEmployee("Mark", 10,50));

        for (Employee x : emps){
            x.getDetails();
            System.out.println(x.calculatePay());
            System.out.println("saasdasd");
        }
    }
}
