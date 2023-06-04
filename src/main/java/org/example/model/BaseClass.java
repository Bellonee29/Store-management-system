package org.example.model;

public abstract class BaseClass {
    private String staffName;
    private String staffID;
    private String staffPhone;
    private String staffAddress;
    private  String staffRoles;

    public BaseClass(String staffName, String staffID, String staffPhone, String staffAddress, String staffRoles) {
        this.staffName = staffName;
        this.staffID = staffID;
        this.staffPhone = staffPhone;
        this.staffAddress = staffAddress;
        this.staffRoles = staffRoles;
    }

    public String getStaffName() {
        return staffName;
    }

    public String getStaffID() {

        return staffID;
    }

    public String getStaffPhone() {

        return staffPhone;
    }

    public String getStaffAddress() {

        return staffAddress;
    }

    public String getStaffRoles() {
        return staffRoles;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffName='" + getStaffName() + '\'' +
                ", staffID=" + getStaffID() +
                ", staffPhone=" + getStaffPhone() +
                ", staffAddress='" + getStaffAddress() + '\'' +
                ", staffRoles='" + getStaffRoles() + '\'' +
                '}';
    }

}

