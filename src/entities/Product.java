package entities;


public class Product {
    public String name;
    public double price;
    public int quantity;

    //Still public Here because wu need for another exercise
    public Product() {
    }

    //For the Heritage and Polymorph exercise
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double TotalValueInStock(){
        return getPrice() * getQuantity();
    }

    public void AddProducts(int qAdd){
        if(qAdd < 0){
            System.out.println("Can't be minor than zero");
            return;
        }
        int amount = getQuantity();
        setQuantity((amount + qAdd));
        System.out.print("Updatedata: ");
        System.out.println(toString());
    }

    public void RemoveProducts(int qAdd){
        if(qAdd < 0){
            System.out.println("Can't be minor than zero");
            return;
        }
        int amount = getQuantity();
        setQuantity((amount - qAdd));
        System.out.print("Updatedata: ");
        System.out.println(toString());
    }

    public String priceTag(String tag){
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("$ ").append(price);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + name);
        sb.append("Current price: " + String.format("%.2f", price));
        sb.append("Current quantity: " + quantity + " units");
        sb.append("Total price: " + TotalValueInStock());
        return sb.toString();
    }
}
