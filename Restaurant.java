import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private String address;
    private List<MenuItem> menuItems;

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
        this.menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
