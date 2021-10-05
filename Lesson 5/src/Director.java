import java.util.Arrays;

public class Director extends Employee {

    private  Employee[] employees;

    public Director(String name, String surname, int age) {
        super(name, surname, age);
    }

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    public void setProf() {
      this.prof = Position.DIRECTOR;
    }


    public void addWorker (Employee employee) {
        if (employees == null ) {
            employees = new Employee[1];
            employees[0] = employee;
        } else {
            employees = Arrays.copyOf(employees, employees.length + 1);
            employees[employees.length - 1] = employee;
        }
    }

    @Override
    public int printSalary() {
       if (employees == null) {
           return super.printSalary();
       }else {
           return super.printSalary() * employees.length;
       }
    }

    @Override
    public String toString() {
        return "Director{" +
                " prof=" + prof +
                ", salary = " +  printSalary() +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}

