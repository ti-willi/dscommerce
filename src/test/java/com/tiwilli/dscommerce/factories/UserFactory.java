package com.tiwilli.dscommerce.factories;

import com.tiwilli.dscommerce.entities.Role;
import com.tiwilli.dscommerce.entities.User;

import java.time.LocalDate;

public class UserFactory {

    public static User createClientUser() {
        User user = new User(1L, "Maria", "maria@gmail.com", "988888888", LocalDate.parse("2001-07-25"), "$2a$10$supupgiQRoc5DxF7xpTrue74MkEHj94TDM4bJ1L9eZtUdljvw2Ghm");
        user.addRole(new Role(1L, "ROLE_CLIENT"));
        return user;
    }

    public static User createAdminUser() {
        User user = new User(1L, "Alex", "alex@gmail.com", "988888888", LocalDate.parse("2001-07-25"), "$2a$10$supupgiQRoc5DxF7xpTrue74MkEHj94TDM4bJ1L9eZtUdljvw2Ghm");
        user.addRole(new Role(2L, "ROLE_ADMIN"));
        return user;
    }

    public static User createClientUser(Long id, String username) {
        User user = createClientUser();
        user.setId(id);
        user.setEmail(username);
        return user;
    }

    public static User createAdminUser(Long id, String username) {
        User user = createAdminUser();
        user.setId(id);
        user.setEmail(username);
        return user;
    }
}
