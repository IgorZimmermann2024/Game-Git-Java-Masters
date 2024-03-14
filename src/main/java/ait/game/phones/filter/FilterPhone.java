package ait.game.phones.filter;
import java.util.Arrays;
import ait.game.phones.classCellPhone.CellPhone;

public class FilterPhone {
    /*
    ### Задача 3: Фильтрация телефонов по ценовому диапазону

**Цель:** Создать функцию, которая фильтрует массив телефонов по заданному ценовому диапазону.

**Описание задачи:**
- На основе класса `` и массива телефонов реализуйте функцию `filterPhonesByPriceRang`,
которая принимает два аргумента: минимальную и максимальную цену.
- Функция должна возвращать новый массив, содержащий только те телефоны,
цена которых находится в указанном диапазоне.

     */
    public static CellPhone[] filterPhonesByPriceRange(double minPrice, double maxPrice, CellPhone[] phones) {
        filteredPhones = filterPhonesByPriceRange(phones,minPrice,maxPrice);

        filteredPhones = new ArrayList<>();
        for (CellPhone phone : phones){
            double price = phone.getPrice();
            if (price >= minPrice && price <= maxPrice){
                filteredPhones.add(phone);

            }

        }
        return filteredPhones;





    }


}



