package Domain;

public class easyObject {

    String name;
    double price;
    String address;
    int orderID;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public easyObject(String name, double price, String address, int orderID) {
        this.name = name;
        this.price = price;
        this.address = address;
        this.orderID = orderID;
    }
}
