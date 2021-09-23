
public abstract class Employee extends Person{

    private int age;

    public Employee(String name, String surname, int age) {
        super(name, surname);
        this.age = age;
    }

    public abstract Position getPost();

    public int printSalary () {
        return 1000 * age * getPost().getKoef();
    }

}
