package uk.ac.york.eng2.sm.kafkaobjects;

import io.micronaut.serde.annotation.Serdeable;

import java.util.HashSet;
import java.util.Set;

@Serdeable
public class UserSet {

    private Set<Long> users = new HashSet<>();

    public UserSet() {
    }

    public void removeAll(UserSet users) {
        if (users == null) {
            return;
        }
        this.users.removeAll(users.getUsers());
    }

    public Set<Long> getUsers() {
        return users;
    }

    public void setUsers(Set<Long> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserSet{" +
                "users=" + users +
                '}';
    }
}
