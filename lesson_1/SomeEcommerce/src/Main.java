public class Main {
    public static void main(String[] args) {
        Cart vasyaCart = new Cart(7000);
        Cart igorCart = new Cart();
        Cart mishaCart = new Cart("smartphone", 9800);

        igorCart.addToCart("Sneakers", 2600, 1);
        igorCart.addToCart("body", 1500, 2);
        igorCart.addToCart("jacket", 6700, 1);
        igorCart.print("In Igor cart: ");
        System.out.println("Total in Igor cart: "+igorCart.getTotal());

        vasyaCart.addToCart("Shoes", 2700, 2);
        vasyaCart.print("in Vasya cart: ");
        System.out.println("Total in Vasya cart: "+vasyaCart.getTotal());

        mishaCart.print("in Misha cart: ");
    }
}
