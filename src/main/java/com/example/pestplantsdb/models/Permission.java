package com.example.pestplantsdb.models;

public enum Permission {
    PLANT_READ("plants:read"),
    PLANT_WRITE("plants:write");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
