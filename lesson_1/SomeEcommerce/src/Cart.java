public class Cart {

    private static String items = "";
    private static int total = 0;
    public static void main(String[] args) {
        addToCart("Sneakers", 4200);
        addToCart("Polo", 1600);
        addToCart("Shorts", 1800);
        print("Cart Contains: ");
        System.out.println("total to pay: "+getPrice());
        clear();
        print("Cart contains");
    }
    public static void addToCart (String product, int price) {
        items = items + "\n"+ product + "-"+ price;
        total += price;
    }

    public static void clear () {
        items = "";
        total = 0;
    }

    public static int getPrice () {
        return total;

    }
    public static void print (String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Cart is Empty");
        }
        else System.out.println(items);
    }
}
