public class Methods {

    private String name;
    private int age;

    public Methods(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printUserInfo() {
        if (validateAge()) {
            System.out.println(name + " " + age);
        } else {
            System.out.println("error");
        }
    }

    public int printUserInfo() {
        if (validateAge()) {
            System.out.println(name + " " + age);
        } else {
            System.out.println("error");
        }
    }

    private boolean validateAge() {
        boolean result;
        if (age >= 0 && age < 100) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}