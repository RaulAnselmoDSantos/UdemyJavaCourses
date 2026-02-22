package entities;


public class Product {
    public String name;
    public double price;
    public int quantity;

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
            System.out.println("Não pode ser minor que zero");
            return;
        }
        int amount = getQuantity();
        setQuantity((amount + qAdd));
        System.out.print("Updatedata: ");
        System.out.println(toString());
    }

    public void RemoveProducts(int qAdd){
        if(qAdd < 0){
            System.out.println("Não pode ser minor que zero");
            return;
        }
        int amount = getQuantity();
        setQuantity((amount - qAdd));
        System.out.print("Updatedata: ");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Product data:" +
                "name='" + name + '\'' +
                ", price= $" + String.format("%.2f", price) +
                ", quantity=" + quantity + " units" +
                ", Total:= $" + TotalValueInStock();
    }
}
