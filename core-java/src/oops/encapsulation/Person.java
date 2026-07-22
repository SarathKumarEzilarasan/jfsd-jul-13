package oops.encapsulation;

// POJO -> Plain Old Java Object
public class Person {
    private String username;
    private String password;

    // getter
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // setter
    public void setUsername(String username) {
       this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
