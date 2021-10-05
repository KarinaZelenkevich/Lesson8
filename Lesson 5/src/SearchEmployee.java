import java.util.Objects;

public class SearchEmployee implements SearchService{

    @Override
    public boolean find() {
        return false;
    }

    @Override
    public void printInfoEmpl() {

    }

    public boolean find(Director director, String name) {
        Employee [] employees = director.getEmployees();
        for (Employee employee : employees) {
            String emplName = employee.name;
            if (emplName.equals(name)) {
                System.out.println("The employee " + name + " found with the director " + director.name);
            }
            if (employee.prof.equals(Position.DIRECTOR)) {
                return find((Director)employee, name);
            }
        }
        return false;
    }
}
