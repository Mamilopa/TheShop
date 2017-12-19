
package TheShop;

public class Book extends Goods implements GetShippingCost{

    public String author;
    public int distance; // i km

    public Book(String name, double price, String description, String author, int distance) {
        super(name, price, description);
        this.author = author;
        this.distance = distance;
        
    }
    
    public String getAuthor (){
        return author;
    }

    public int getDistance (){
    return distance;
}
       
    @Override
    public String printAll(){
           return ("Item: "+name+ " Author: "+ author +"\n" +"Description: "+ description+ "\n" +"SEK " + price);
}
    
    
    @Override
    public double shippingCost() {
       int shippingCost;
       shippingCost = distance*PRICEPERMILE;
       return shippingCost;
    
    }

    @Override
    public String toString() {
        return "Item: "+name+ " Author: "+ author +"\n" +"Description: "+ description+ "\n" +"SEK " + price;
    }


    
}
