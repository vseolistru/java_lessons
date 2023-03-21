public class Main {
    public static void main(String[] args) {
        System.out.println("Система расчета стоимости топлива");
        int fuelType = 95;
        int amount = 50;

        double fuel92Price = 60.2;
        double fuel95Price = 67.25;
        double discount = 0.1;
        double total = 0;
        if ( fuelType == 92 ){
            total = fuel92Price * amount;
        }
        else total = fuel95Price * amount;

        if (amount > 10) {
            total = total - (total*discount);
        }

        System.out.println(total);
    }
}