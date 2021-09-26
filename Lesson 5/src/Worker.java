public class Worker extends Employee {
    private int age;

    public Worker(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void setProf() {
    this.prof = Position.WORKER;
    }


}
