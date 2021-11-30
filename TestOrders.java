import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        // Menu items
        Item item1 = new Item();
        item1.name = "taco";
        item1.price = 1.50;
        Item item2 = new Item();
        item2.name = "burrito";
        item2.price = 2.00;
        Item item3 = new Item();
        item3.name = "nachos";
        item3.price = 3.50;
        Item item4 = new Item();
        item4.name = "churro";
        item4.price = 0.75;
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Will";
        order1.ready = true;
        order1.items.add(item1);
        order1.items.add(item4);
        order1.getTotal();
        
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.println("Items: " + order1.items.get(0).name);
    }
}