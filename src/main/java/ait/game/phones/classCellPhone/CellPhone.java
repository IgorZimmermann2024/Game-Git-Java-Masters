package ait.game.phones.classCellPhone;

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
}
