import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product nuts = new Product("орех", 100);
        Drink fanta = new Drink("fanta", 25);
        HotDrink coffe = new HotDrink("coffe", 120,45);
        fanta.setVolume(1);
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(nuts);
        productList.add(fanta);
        productList.add(coffe);
        for (Product el: productList){
            el.consume();
        }
    }
}
