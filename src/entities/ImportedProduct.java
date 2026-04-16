package entities;

public final class ImportedProduct extends Product{
    private Double customsFree;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, double price, Double customsFree) {
        super(name, price);
        this.customsFree = customsFree;
    }

    public Double customsFree() {
        return customsFree;
    }

    public void setCustomFree(Double customsFree) {
        this.customsFree = customsFree;
    }

    public Double totalPrice() {
        return price + customsFree;
    }

    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("$ ").append(totalPrice()).append("(Customs fee: $" + customsFree + ")");
        return sb.toString();
    }
}
