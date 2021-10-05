import java.util.*;

public class Main {

    public static void main(String... args) {

        List<User> users = new ArrayList<>();
        users.add(new User("AUser5", "female", 11));
        users.add(new User("Cser6", "male", 135));
        users.add(new User("PUser7", "female", 33));
        users.add(new User("OUser7", "female", 33));
        users.sort(Comparator.comparing(User::getAge).thenComparing(User::getName));
        System.out.println(users);
        System.out.println();

        Set<User> set = new TreeSet<>(new UserComparator<User>());
        set.add(new User("User1", "male", 25));
        set.add(new User("User2", "female", 15));
        set.add(new User("User3", "male", 2));
        set.add(new User("User4", "male", 20));
        set.add(new User("User4", "male", 20));
        set.add(new User("User4", "male", 20));
        set.add(new User("User4", "male", 20));
        System.out.println(set);




//            Integer[] ar = {1, 2, 4, 5, 10, 11, 1, 2, 3, 4, 12, 6, 6, 6, 3, 2, 1, 6};
//            Element_Array search= new Element_Array();
//            search.count(ar);
//            System.out.println(search.getMap());
//        }
        }
    }

