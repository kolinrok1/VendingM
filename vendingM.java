import java.util.ArrayList;

public class vendingM {
    private ArrayList <Product> goods;

    public vendingM(ArrayList <Product> goods){
        this.goods = goods;
    }

    public Product getPoductByuName(String name){
        for (Product el: goods){
            if (el.getName().equals(name)) return el;
        }
        return null;
    }
}
