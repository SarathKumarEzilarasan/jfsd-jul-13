package access_modifiers;

public class User {

    public String username;
    public static String password = "test@123";

    public static void main(String[] args) {
        System.out.println(password);
    }
}
