

public class User {
    private String gender;
    private String name;
    private String surname;
    private int age;
    int UserAge = 0;

    public User(String name, String surname, int age, String gender) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int PrintAge () {
        if (age >= 0) {
        }return age + 1;
    }
    public void PrintUserInfo() {
        System.out.println(name + " " + surname);
        System.out.println(PrintAge());
        System.out.println(" Имя пользователя: " + name + "," + " Фамилия: " + surname+ "," + " Пол: " + gender + "," + " Возврат: " + PrintAge());
    }
}

