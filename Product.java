public class Product {

    private String name;
    private float price;

    public Product(String mame, float price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return  name;
    }
    public float getPrice(){
        return price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public void consume(){
        System.out.println("Продук потреблен");
    }
}

