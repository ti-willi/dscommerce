package com.tiwilli.dscommerce.factories;

import com.tiwilli.dscommerce.projections.UserDetailsProjection;

import java.util.ArrayList;
import java.util.List;

public class UserDetailsFactory {

    public static List<UserDetailsProjection> createClientUser(String username) {
        List<UserDetailsProjection> list = new ArrayList<>();
        list.add(new UserDetailsImpl(username, "123456", 1L, "ROLE_CLIENT"));
        return list;
    }

    public static List<UserDetailsProjection> createAdminUser(String username) {
        List<UserDetailsProjection> list = new ArrayList<>();
        list.add(new UserDetailsImpl(username, "123456", 2L, "ROLE_ADMIN"));
        return list;
    }

    public static List<UserDetailsProjection> createAdminAndClientUser(String username) {
        List<UserDetailsProjection> list = new ArrayList<>();
        list.add(new UserDetailsImpl(username, "123456", 1L, "ROLE_CLIENT"));
        list.add(new UserDetailsImpl(username, "123456", 2L, "ROLE_ADMIN"));
        return list;
    }
}

class UserDetailsImpl implements UserDetailsProjection {

    private String username;
    private String password;
    private Long roleId;
    private String authority;

    public UserDetailsImpl() {
    }

    public UserDetailsImpl(String username, String password, Long roleId, String authority) {
        this.username = username;
        this.password = password;
        this.roleId = roleId;
        this.authority = authority;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public Long getRoleId() {
        return roleId;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}