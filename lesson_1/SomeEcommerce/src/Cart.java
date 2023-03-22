public class Cart {

    private String items = "";
    private int total = 0;
    private int limit;
    public Cart(){
        items = "Some products";
        this.limit = 15000;
    }
    public Cart(int totalLimit) {
        this();
        limit = totalLimit;
    }
    public Cart(String items, int total){
        this();
        this.items = this.items + items;
        this.total = total;
    }
    public void addToCart (String product, int price, int count) {
        if(contains(product)){
            System.out.println("Product already is in a cart");
            return;
        }

        if (total + price * count>= limit) {
            return;
        }
        items = items + "\n"+ product + "-"+ price+ " quantity: "+count;
        total += price * count;
    }

    public void clear () {
        items = "";
        total = 0;
    }

    public int getTotal () {
        return total;

    }
    public void print (String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Cart is Empty");
        }
        else System.out.println(items);
    }
    public boolean contains (String product) {
        return items.contains(product);
    }

}
