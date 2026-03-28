package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Integer id = 0;
    private Date moment;
    private OrderStatus status;

    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Order() {}

    //Are here because of the second Exercise's fixation
    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Order(Integer id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        this.items.add(item);
    }

    public void removeItem(OrderItem item){
        this.items.remove(item);
    }

    public Double total(){
        Double total = 0.0;
        for(OrderItem item : items){
            total += item.SubTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order: ").append("\n");
        sb.append("Client : " + client.getName()).append("\n");
        sb.append("id = " + id ).append("\n");
        sb.append("moment = " + "(" +sdf.format(moment)).append(")" + "\n");
        sb.append("status = " + status).append("\n");
        sb.append("Order Items: ").append("\n");
        sb.append(items).append("\n");
        sb.append("Total price: ").append(total());
        return sb.toString();
    }
}
