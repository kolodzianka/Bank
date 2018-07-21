package com.kolodzianka;

public class PersonalAccount extends Account {

    public PersonalAccount(String name, String surname, String clientID) {
        super.openAccount(name, surname, clientId, true);
    }

    @Override
    TYPE accountType() {
        return TYPE.PERSONAL_ACCOUNT;
    }

    @Override
    public String toString() {
        return "PersonalAccount{" + super.toString();
    }


}
