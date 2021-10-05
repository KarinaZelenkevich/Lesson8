
public abstract class Employee extends Person {

    private int age;
    protected Position prof;
    private int basic = 1000;


    public Employee(String name, String surname, int age) {
        super(name, surname);
        this.age = age;
        setProf();
    }


    public abstract void setProf ();

    public int printSalary () {
        return basic * prof.getKoef() * age;
    }

    @Override
    public String toString () {
        return "Employee{" +
                "age=" + age +
                ", prof=" + prof +
                ", basic=" + basic +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
        }

    }
