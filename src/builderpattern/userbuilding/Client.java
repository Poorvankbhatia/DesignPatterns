package builderpattern.userbuilding;

public class Client {

    public static void main(String[] args) {
        User u1 = new User.UserBuilder("custom_firstname","custom_lastname").build();
        User u2 = new User.UserBuilder("custom_firstname","custom_lastname").address("custome_address").build();
        User u3 = new User.UserBuilder("custom_firstname","custom_lastname").phone(9292929).build();
        User u4 = new User.UserBuilder("custom_firstname","custom_lastname").email("custom_email").age(12).build();
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
        System.out.println(u4);
    }

}
