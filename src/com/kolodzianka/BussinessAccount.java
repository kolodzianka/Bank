package com.kolodzianka;

public class BussinessAccount extends Account {

    private int nip;
    private int regon;

    public BussinessAccount(String name, String surname, String clientID, boolean isOpen, int nip, int regon) {
        super.openAccount(name, surname, clientId, isOpen);
        this.nip = nip;
        this.regon = regon;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public int getRegon() {
        return regon;
    }

    public void setRegon(int regon) {
        this.regon = regon;
    }

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
