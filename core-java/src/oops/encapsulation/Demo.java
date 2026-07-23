package oops.encapsulation;

public class Demo {
    public static void main(String[] args) {
//        Person john = new Person("john", "user@123");
//        person.username = "peter";
//        System.out.println(person.getUsername());
//        person.setUsername("peter");
//        System.out.println(person.getUsername());

//        System.out.println(john.getUsername());
//        System.out.println(john.getPassword());

        Student student = new Student("john", "user@123", "BE","CEG");
        System.out.println(student.getCollege());
        System.out.println(student.getUsername());
    }
}

// constructors