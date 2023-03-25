public class Product {
    private String title;
    private double price;

    //immutable data
    //==========================================
    private final String name = "Some Product";
    private double discount = 0.15;
    public String getName() {
        return name;
    }

    public double getDiscount() {
        return discount;
    }
    //==========================================

    public Product (String title,double price){
        this.title = title;
        this.price = price;
    }
    public void  setTitle(String title){
        this.title = title;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
    public String toProductString(){
        return title+" - "+price;
    }
}
