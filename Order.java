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
        this.ArrayList<Item> = new ArrayList();
    }

    public Order(String name){
        this.name = name;
        this.ArrayList<Item> = new ArrayList();
    }


//---Methods---
    public void addItem(Item){

    }

    public void getStatusMessage(){

    }
    public void getOrderTotal(){

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