import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private Restaurant restaurant;
    private List<MenuItem> items;
    private double totalAmount;

    public Order(Customer customer, Restaurant restaurant) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
        totalAmount += item.getPrice();
    }

    // Getters

    public Customer getCustomer() {
        return customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
