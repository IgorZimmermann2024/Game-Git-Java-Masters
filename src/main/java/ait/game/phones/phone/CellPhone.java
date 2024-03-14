package ait.game.phones.phone;

public class CellPhone {
    private String model;
    private String manufacturer;
    private double price;

    public CellPhone(String model,String manufacturer,double price){
        this.model = model;
        this.manufacturer =manufacturer;
        this.price = price;
    }


    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
    public CellPhone[] phonesArray(){
        CellPhone[] arrayCallPhone = new CellPhone[5];
        arrayCallPhone[0] = new CellPhone("Galaxy A15", "Samsung",179);
        arrayCallPhone[1] = new CellPhone("Readmi 13C", "Xiaomi",115);
        arrayCallPhone[2] = new CellPhone("iPhone 14Pro", "Apple",1049);
        arrayCallPhone[3] = new CellPhone("edge40", "Motorola",345);
        arrayCallPhone[4] = new CellPhone("Refurbished Pixel 7 Pro", "Google",849);
        return arrayCallPhone;
    }

    public void phonesInfo(CellPhone[] arrayPhones){
        for(CellPhone phone : arrayPhones){
            System.out.println(phone.toString());
        }
    }
}
