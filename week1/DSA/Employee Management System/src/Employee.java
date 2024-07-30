public class Employee {
    int employeeId;
    String name;
    String position;
    float salary;

    public Employee(int employeeId, String name, String position, float salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return new String(this.name);
    }
}
