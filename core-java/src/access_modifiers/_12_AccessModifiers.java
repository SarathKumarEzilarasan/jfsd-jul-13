package access_modifiers;

public class _12_AccessModifiers {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.password);
    }
}


// private -> only the same class can access
// default -> same class can access + other classes in same package can access
// protected -> same class can access + other classes in same package can access + child classes in other package
// public  -> anyone can access

// private > default > protected > public --> access modifiers
