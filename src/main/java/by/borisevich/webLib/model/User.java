package by.borisevich.webLib.model;

public class User {

    private int id;
    private String username;
    private String password;
    private String userEmail;
    private String userCountry;

    public User(String username, String password, String userEmail, String userCountry) {
        this.username = username;
        this.password = password;
        this.userEmail = userEmail;
        this.userCountry = userCountry;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }
}
