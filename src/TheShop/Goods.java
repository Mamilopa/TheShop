
package TheShop;

public abstract class Goods {

public String name;
public double price;
public String description;


public Goods(String name, double price, String description)//constructor måste heta samma som class
{
    this.name= name;
    this.price = price;
    this.description = description;
    
   }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
    
    public abstract String printAll();
       
    //@Override
    public abstract String toString(); //{
        //return "Goods{" + "name= " + name + ", price= " + price + ", description= " + description + '}'+ "\n";
    //}



    
}
