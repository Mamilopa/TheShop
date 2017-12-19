package TheShop;

import java.util.ArrayList;
import java.util.Iterator;

public class TheStore {

    public static void main(String[] args) {//main method
        int shippableItems = 0;
        ArrayList<Goods> goodsList1 = new ArrayList<Goods>();
        ArrayList<Goods> goodsList2 = new ArrayList<Goods>();

        Grocery grocery1 = new Grocery("Cucumber", 30.00, "green vegetable", 0.3);
        Grocery grocery2 = new Grocery("Tomato", 40.00, "red vegetable", 0.1);
        Grocery grocery3 = new Grocery("Aubergine", 55.00, "purple vegetable", 0.5);
        Clothes clothes1 = new Clothes("Shirt", 450.50, "Pink shirt with buttons", 38, 30);
        Clothes clothes2 = new Clothes("Pant", 1300.00, "Blue pants with frogs", 44, 50);
        Clothes clothes3 = new Clothes("T-shirt", 250.00, "T-shirt with print", 36, 70);
        Book book1 = new Book("Hello World", 175.00, "Book on the world", "Ola Price", 30);
        Book book2 = new Book("Hello Life", 275.00, "Book on life", "Paul Jinx", 40);
        Book book3 = new Book("Hello Class", 560.00, "Book on the class", "Gunnar Long", 80);

        System.out.println(book3.description);
        System.out.println(book1.printAll());
        System.out.println(grocery1.printAll());
        System.out.println(clothes1.printAll());
        System.out.println("Shipping cost for book3 " + book3.shippingCost());

        goodsList1.add(book3);
        goodsList1.add(book1);
        goodsList1.add(book2);
        goodsList1.add(grocery1);
        goodsList1.add(grocery2);
        goodsList1.add(grocery3);
        goodsList1.add(clothes1);
        goodsList1.add(clothes2);
        goodsList1.add(clothes3);

        System.out.println(goodsList1);

        System.out.println(goodsList1);
        for (Goods goods : goodsList1) {
            if (goods instanceof GetShippingCost) {
                shippableItems++;

            }

        }
        System.out.println(shippableItems);

        for (Goods goods : goodsList1) {
            if (goods instanceof GetShippingCost) {
                goodsList2.add(goods);//lägger till på ny ArrayList som jag skapat
            }

        }
        System.out.println("These items are Shippable: \n" + goodsList2);

    }
}
