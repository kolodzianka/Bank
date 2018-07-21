package com.kolodzianka;

public abstract class Account {

    String name;
    String surname;
    String clientId;
    boolean isOpen = false;

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
        isOpen = true;
       
    }

    void closeAccount(String name, String surname, String clientId, boolean isOpen) {
        isOpen = false;

    }

    void income() {
    }

    void outcome() {
    }

    abstract void accountType ();

    private enum TYPE {

        PERSONAL_ACCOUNT,
        BUSINESS_ACCOUNT;

    }

}
