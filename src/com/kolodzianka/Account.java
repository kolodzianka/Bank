package com.kolodzianka;

public abstract class Account {

    String name;
    String surname;
    String clientId;
    boolean isOpen = false;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", clientId='" + clientId + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }

    void openAccount(String name, String surname, String clientId, boolean isOpen) {
        this.name =name;
        this.surname =surname;
        this.clientId= clientId;
        isOpen = true;

    }

    void closeAccount(String name, String surname, String clientId, boolean isOpen) {
        this.name =name;
        this.surname =surname;
        this.clientId= clientId;
        isOpen = false;

    }

    void income() {
    }

    void outcome() {
    }

    abstract TYPE accountType ();

    public enum TYPE {

        PERSONAL_ACCOUNT,
        BUSINESS_ACCOUNT;

    }

}
