import java.util.ArrayList;

public class HotDrinkVendingMachine extends vendingM {

    private  ArrayList<Drink> drinkHotArrayList;
    public HotDrinkVendingMachine(ArrayList<Product> goods) {
        super(goods);
        drinkHotArrayList = new ArrayList<>();
    }
    public HotDrink getPoductByuName(String name, float volume, int tmp) {
        for (HotDrink el : drinkHotArrayList) {
            if (el.getName().equals(name) && el.getVolume()==volume && el.getTemp()==tmp) return el;
        }
        return null;
    }


}
