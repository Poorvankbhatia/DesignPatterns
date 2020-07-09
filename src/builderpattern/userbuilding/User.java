package builderpattern.userbuilding;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String address;
    private long phoneNo;

    private User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.address = userBuilder.address;
        this.email = userBuilder.email;
        this.age = userBuilder.age;
        this.phoneNo = userBuilder.phoneNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNo=" + phoneNo +
                '}';
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private String email;
        private int age;
        private String address;
        private long phoneNo;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder phone(long phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

}
