package maven.fetcher;

import java.util.Objects;

public class Repository {

    private final String id;
    private final String url;
    private String username;
    private String password;
    private int priority;


    public Repository(String id, String url) {
        this.id = Objects.requireNonNull(id);
        this.url = Objects.requireNonNull(url);
    }


    public Repository credentials(String username, String password) {
        this.username = Objects.requireNonNull(username);
        this.password = Objects.requireNonNull(password);
        return this;
    }


    public Repository priority(int priority) {
        this.priority = priority;
        return this;
    }


    public String username() {
        return username;
    }


    public String password() {
        return password;
    }


    public int priority() {
        return priority;
    }


    @Override
    public String toString() {
        if (username != null) {
            return String.format("%s=%s [%s=%s]", id, url, username, password );
        } else {
            return String.format("%s=%s", id, url);
        }
    }


    public boolean isAuthenticated() {
        return username != null;
    }

}
