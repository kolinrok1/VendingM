import java.util.ArrayList;

public class DrinkMachine extends  vendingM {

    private ArrayList<Drink> drinkArrayList;

    public DrinkMachine(ArrayList<Product> goods) {
        super(goods);
        drinkArrayList = new ArrayList<>();
    }

    public void addDrink(Drink dr) {
        drinkArrayList.add(dr);
    }

    public Drink getPoductByuName(String name) {
        for (Drink el : drinkArrayList) {
            if (el.getName().equals(name)) return el;
        }
        return null;
    }
}
