package ait.game.phones.find;

public class FindPhone {

    }
            //  CellPhone[] allPhone--> Класс с объектом Телефон //  modelPhone --> Вводные данные Модели телефона
    public static void findPhoneByModel(CellPhone[] allPhone ,String modelPhone) {
        for (String phone : allPhone) {
            if (modelPhone.equals(phone)) {
                System.out.println();
            } else {
                System.out.println("Phone not found!");
            }
        }
    }
}