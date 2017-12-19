package TheShop;

public class Grocery extends Goods {

    public double weight;

    public Grocery(String name, double price, String description, double weight) {
        super(name, price, description);
        this.weight = weight;

    }
    @Override
 public String printAll(){
     return ("Item: "+name +"\n" +"Description: "+ description+ "\n"+"SEK " + price + " Weight: "+ weight + "gr");
}

    @Override
    public String toString() {
        return "Item: "+name +"\n" +"Description: "+ description+ "\n"+"SEK " + price + " Weight: "+ weight + "gr";
    }
 
}