package entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    private Date manufactureDate;

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct() {
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(String tag){
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" (used) $ ").append(price).append("(Manufacture date: " + getManufactureDate() + ")");
        return sb.toString();
    }
}
