import java.util.*;
public class Order{
    private String name;
    //public double total;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList();

    //public double getTotal(){
        //for(Item item : items){
            //total = total + item.price;
            //System.out.println(total);
        //}
        //return total;
    //}
    //---Constuctors---
    public Order(){
        this.name = "Guest";
        this.ready = false;
    }

    public Order(String name){
        this.name = name;
        this.ready = false;
    }


//---Methods---
    public void addItem(Item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        if(this.ready == true) {
            return "Your order is ready.";
        } else {
            return  "Thank you for waiting. Your order will be ready soon.";
        }
    }
    public double getOrderTotal(){
        double total = 0.0;
        for(Item i: this.items) {
            total += i.getPrice();
        }
        return total;
    }

    }

    public void display(Order){
        System.out.println(this.name);
        System.out.println(this.items.price);
        System.out.println(getOrderTotal);
    }
    //---Setters and Getters---
    public void setGuestName(String guestName){
        name = guestName;
    }
    
    public void setOrderReady(boolean orderReady){
        ready = orederReady;
    }

    public String getGuest(){
        return name;
    }

    public boolean getReady(){
        return ready;
    }
}