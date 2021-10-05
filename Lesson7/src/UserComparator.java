import java.util.Comparator;

public class UserComparator<U> implements Comparator <User> {

    @Override
    public int compare(User o1, User o2) {
        User users = (User) o1;
        if (o1.getAge() < o2.getAge()) {
            return -1;

        } else if (o1.getAge() > o2.getAge()) {
            return 1;
        }
        return o1.getName().compareTo(o2.getName());
    }
}