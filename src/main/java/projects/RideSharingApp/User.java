package projects.RideSharingApp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
abstract class User {
    protected String name;
    protected Location location;
    protected String email;

    public User(String name, Location location, String email) {
        this.name = name;
        this.location = location;
        this.email = email;
    }

    public abstract void notify(String msg);
}
