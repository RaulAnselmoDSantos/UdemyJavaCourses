package entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public Double SubTotal(){
        Double SubTotal = price * quantity;
        return SubTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product Name: " + product.getName()).append("\n");
        sb.append("Purchase quantity: " + quantity).append("\n");
        sb.append("Purchase price: " + price).append("\n");
        sb.append("Subtotal: " + SubTotal()).append("\n");
        return sb.toString();
    }
}
