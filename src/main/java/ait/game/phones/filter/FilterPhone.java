package ait.game.phones.filter;
import java.util.Arrays;
import  java.util.List;

public class FilterPhone {
    public static ait.game.phones.phone.CellPhone[] filteredPhones;

    /*
        ### Задача 3: Фильтрация телефонов по ценовому диапазону
    
    **Цель:** Создать функцию, которая фильтрует массив телефонов по заданному ценовому диапазону.
    
    **Описание задачи:**
    - На основе класса `` и массива телефонов реализуйте функцию `filterPhonesByPriceRang`,
    которая принимает два аргумента: минимальную и максимальную цену.
    - Функция должна возвращать новый массив, содержащий только те телефоны,
    цена которых находится в указанном диапазоне.
    
         */

    public java.util.List<ait.game.phones.phone.CellPhone> filterPhonesByPriceRange(double minPrice, double maxPrice, ait.game.phones.phone.CellPhone[] phones) {
        java.util.List<ait.game.phones.phone.CellPhone> filteredPhones = new java.util.ArrayList<>();
        for (ait.game.phones.phone.CellPhone phone : phones){
            double price = phone.getPrice();
            if (price >= minPrice && price <= maxPrice){
                filteredPhones.add(phone);

            }

        }
        return filteredPhones;






    }
    public void sortPhonesByPrice(CellPhone[] phones) {
        Arrays.sort(phones, Comparator.comparingDouble(phone -> phone.price));
    }


}






