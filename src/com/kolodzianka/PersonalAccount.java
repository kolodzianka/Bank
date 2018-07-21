package com.kolodzianka;

public class PersonalAccount extends Account {

    public PersonalAccount() {
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
