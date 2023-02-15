public class Drink extends Product {

    protected int volume;
    public Drink(String mame, float price) {
        super(mame, price);
    }

    public float getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
}
