package ait.game.phones.find;

import ait.game.phones.phone.CellPhone;

public class FindPhone {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        findPhoneByModel(cellPhone.phonesArray(), "iPhone 14Pro");
    }

    public static void findPhoneByModel(CellPhone[] allPhone, String modelPhone) {
        boolean check = false;
        for (CellPhone phone : allPhone) {
            if (modelPhone.equals(phone.getModel())) {
                System.out.println(phone.toString());
                check = true;
            }
        }
        if (!check) {
            System.out.println("Phone not found!");
        }
    }
}
