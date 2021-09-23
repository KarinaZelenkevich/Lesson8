import java.io.IOException;

public class Main {

    public static void main(String... args) throws IOException {

        Employee worker1 = new Worker("Mikhail", "Shevtsov", 3);
        worker1.printInfo();
        System.out.println(" сотрудник " + "з.п: " + worker1.printSalary());

        Employee worker2 = new Worker("Svetlana", "Vasileva", 5);
        worker2.printInfo();
        System.out.println(" сотрудник " + "з.п: " + worker2.printSalary());

        Employee worker3 = new Worker("Anastasiya", "Petrova", 2);
        worker3.printInfo();
        System.out.println(" сотрудник " + "з.п: " + worker3.printSalary());

        Employee director = new Director("Ivan", "Petrov", 10);
        director.printInfo();
        System.out.println(" директор " + "з.п: " + director.printSalary());
    }
}
