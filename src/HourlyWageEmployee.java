public class HourlyWageEmployee extends Employee {
    private int id;
    private String name;
    private double salary;

    private double rate;


    HourlyWageEmployee(int id, String name, double rate) {
        this.id = id;
        this.name = name;
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return 20.8 * 8 * getRate();
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
