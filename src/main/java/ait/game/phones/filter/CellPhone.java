package ait.game.phones.filter;
import java.util.Arrays;

public class CellPhone {
    /*
    ### Задача 3: Фильтрация телефонов по ценовому диапазону

**Цель:** Создать функцию, которая фильтрует массив телефонов по заданному ценовому диапазону.

**Описание задачи:**
- На основе класса `CellPhone` и массива телефонов реализуйте функцию `filterPhonesByPriceRange`,
которая принимает два аргумента: минимальную и максимальную цену.
- Функция должна возвращать новый массив, содержащий только те телефоны,
цена которых находится в указанном диапазоне.

     */
    String brand;
    String model;
    double price;

    public CellPhone(String brand,String model,double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public double getPrice(){
        return price;
    }



    }



