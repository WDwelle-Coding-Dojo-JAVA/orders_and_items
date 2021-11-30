public class Item{
    private String name;
    private double price;
//---constructors---
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }
//---Setters and Getters
    public void setName(String newName){
        name = newName;
    }

    public void setPrice(double newPrice){
        price = newPrice;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}