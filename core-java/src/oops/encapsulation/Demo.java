package oops.encapsulation;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person();
//        person.username = "peter";
        System.out.println(person.getUsername());
        person.setUsername("peter");
        System.out.println(person.getUsername());

    }
}
