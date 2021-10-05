
import java.util.*;

public class User implements  Comparable {
    private String name;
    private String gender;
    private  Integer age;


    public User(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(gender, user.gender) && Objects.equals(age, user.age);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age);
    }

    public String getName() {
        return name;
    }


    public String getGender() {
        return gender;
    }


    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }


}
