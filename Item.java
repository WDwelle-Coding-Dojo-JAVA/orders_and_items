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
        this.name = newName;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }
}