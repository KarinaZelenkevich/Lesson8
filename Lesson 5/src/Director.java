public class Director extends Employee {
    private int age=10;


    public Director(String name, String surname, int age){
        super(name, surname, age);
    }

        @Override
        public Position getPost () {
        return Position.DIRECTOR;
    }

        public void addWorker () {

    }


        public int printSalary () {
            return 1000 * age * getPost().getKoef();
    }
}

