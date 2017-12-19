
package TheShop;

public class Clothes extends Goods implements GetShippingCost{

public int size;//38 etc
public int distance;//i km

    public Clothes(String name, double price, String description, int size, int distance) {
        super(name, price, description);
        this.size = size;
        this.distance = distance;
    }


public int getSize (){
    return size;
}

public int getDistance (){
    return distance;
}

@Override
public String printAll(){
     return ("Item: "+name +" "+ "Size:"+ size+"\n" + "Description: "+ description+ "\n" + "SEK " + price);
}
    @Override
    public double shippingCost() {
               int shippingCost;
       shippingCost = distance*PRICEPERMILE;
       return shippingCost;

    }

    @Override
    public String toString() {
        return "Item: "+name +" "+ "Size:"+ size+"\n" + "Description: "+ description+ "\n" + "SEK " + price;
    }



    
}
