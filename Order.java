import java.util.*;
public class Order{
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items = new ArrayList();

    public double getTotal(){
        for(Item item : items){
            total = total + item.price;
            System.out.println(total);
        }
        return total;
    }
}