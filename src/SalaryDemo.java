import java.util.ArrayList;
import java.util.List;

public class SalaryDemo {


    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FixedPaymentEmployee(101, "Bobby", 2000));
        employees.add(new FixedPaymentEmployee(102, "Cobby", 2500));
        employees.add(new FixedPaymentEmployee(102, "Pobby", 2600));
        employees.add(new FixedPaymentEmployee(103, "Robby", 2700));
        employees.add(new FixedPaymentEmployee(104, "Tobby", 2300));
        employees.add(new FixedPaymentEmployee(105, "Mobby", 2100));
        employees.add(new FixedPaymentEmployee(106, "Dobby", 2000));
        employees.add(new FixedPaymentEmployee(107, "Sobby", 2300));
        employees.add(new FixedPaymentEmployee(108, "Lobby", 2600));
        employees.add(new HourlyWageEmployee(109, "Harry", 25));
        employees.add(new HourlyWageEmployee(110, "Barry", 30));
        employees.add(new HourlyWageEmployee(111, "Darry", 20));
        employees.add(new HourlyWageEmployee(112, "Marry", 28));
        employees.add(new HourlyWageEmployee(113, "Tarry", 33));
        employees.add(new HourlyWageEmployee(114, "Carry", 25));

        employees.sort(new EmployeeComparator().thenComparing(Employee::getSalary));
        for (Employee e : employees) {
            System.out.println(e.getName() + " " + e.getSalary());
        }
    }
}
