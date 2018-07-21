package com.kolodzianka;

public class BussinessAccount extends Account {

    private int nip;
    private int regon;


    @Override
    TYPE accountType() {
        return TYPE.BUSINESS_ACCOUNT;
    }


    @Override
    public String toString() {
        return "BussinessAccount{" +
                "nip=" + nip +
                ", regon=" + regon +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", clientId='" + clientId + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }
}
