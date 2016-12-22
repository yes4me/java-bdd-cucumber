package others.page_objects;

/**
 * Created by Thomas on 12/14/2016.
 */
public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // GETTERS
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
