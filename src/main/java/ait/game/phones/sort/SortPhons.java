package ait.game.phones.sort;


import ait.game.phones.phone.CellPhone;

public class SortPhons {
    public static void main(String[] args) {
CellPhone cellPhone=new CellPhone();
sortPhonesByPrice(cellPhone.phonesArray());
    }

    public static void sortPhonesByPrice (CellPhone[] phons){

        for (CellPhone phon: phons) {
            System.out.println(phon.toString());
    }
}}
