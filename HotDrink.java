public class HotDrink extends Drink {

    private int temp;
    public HotDrink(String mame, float price, int temp) {
        super(mame, price);
        this.temp = temp;
    }

    public void setTemp(int temp){
        this.temp = temp;
    }
    public int getTemp(){
        return  temp;
    }
}
