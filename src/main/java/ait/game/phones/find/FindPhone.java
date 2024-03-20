package ait.game.phones.find;

import ait.game.phones.phone.CellPhone;

import java.util.Scanner;

public class FindPhone {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phone model: ");
        String modelPhone = scanner.nextLine();
        findPhoneByModel(cellPhone.phonesArray(), modelPhone);
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
