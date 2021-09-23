public class Worker extends Employee {
    private int age;

    public Worker(String name, String surname, int age) {
        super(name, surname, age);
    }
    @Override
    public Position getPost() {
        return Position.WORKER;
    }
    public int printSalary() {
        return  1000 * age * getPost().getKoef();
    }
}
