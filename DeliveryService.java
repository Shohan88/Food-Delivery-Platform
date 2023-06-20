public class DeliveryService {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("Sadi Shohan", "188/2-D Mirpur-1,Dhaka-1216", "01862263038");

        // Create a restaurant
        Restaurant restaurant = new Restaurant("Pizza King", "Begum Rokeya Avenue");

        // Add menu items to the restaurant
        MenuItem item1 = new MenuItem("Cheese Pizza", "Delicious cheese pizza", 10.99);
        MenuItem item2 = new MenuItem("Pepperoni Pizza", "Classic pepperoni pizza", 12.99);
        restaurant.addMenuItem(item1);
        restaurant.addMenuItem(item2);

        // Create an order
        Order order = new Order(customer, restaurant);

        // Add items to the order
        order.addItem(item1);
        order.addItem(item2);

        // Display order details
        System.out.println("Order details:");
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Restaurant: " + order.getRestaurant().getName());
        System.out.println("Items:");
        for (MenuItem item : order.getItems()) {
            System.out.println("- " + item.getName() + " - " + item.getPrice());
        }
        System.out.println("Total amount: " + order.getTotalAmount());
    }
}
