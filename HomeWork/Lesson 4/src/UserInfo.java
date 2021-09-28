public class UserInfo {

    public String name;
    public int age;

    public UserInfo() {
        System.out.println("Constructor empty");
    }

    public UserInfo(String name, int age) {
        this ();
        this.name = name;
        this.age = age;
    }
    @Deprecated
    public void printAddress() {
        Address address = new Address("Russia", "Sportivnaya 54/a");
        address.print();
    }

    private class Address {
        private String country;
        private String home;
        private String city;

        public Address(String country, String home) {
            this.country = country;
            this.home = home;
            this.city = city;
        }

        public void print() {
            System.out.println("Address for user " + name + " is " + country + ", " + "Moscow" + ", " + home);
        }
    }
}
