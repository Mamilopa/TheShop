
package TheShop;

import java.util.ArrayList;


public class GoodsList {

     ArrayList<Goods> list = new ArrayList<Goods>();
   
    
public GoodsList(){
       
}

public void addObject(Goods goods){
    
    list.add(goods);
    
}



    @Override
    public String toString() {
        return "GoodsList{" + "list=" + list + '}';
    }


   
}
