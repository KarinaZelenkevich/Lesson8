import java.io.IOException;

public class Main {

    public static void main(String... args) throws IOException {

        Employee worker1 = new Worker("M1", "MS1", 3);
        Employee worker2 = new Worker("M2", "MS2", 6);
        Employee worker3 = new Worker("M3", "MS3", 2);
        Employee worker4 = new Worker("M4", "MS4", 10);

        Employee director1 = new Director("D1", "DS1", 12);
        Employee director2 = new Director("D2", "DS2", 4);

        ((Director)director1).addWorker(worker1);
        ((Director)director1).addWorker(worker2);
        ((Director)director1).addWorker(worker3);

        ((Director)director2).addWorker(worker4);
        ((Director)director1).addWorker(director2);

        System.out.println(director1);
        System.out.println(director2);

    }
}
