public class Main {
    public static void main(String[] args) {
        boolean isBlocked = true;
        int coffeeAmount = 1800;
        int milkAmount = 1500;
        int lowLactoseAmount = 1000;
        int skimmedMilkAmount = 1300;
        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 15;
        int count = 0;

        while (skimmedMilkAmount >= cappucinoMilkRequired &&
                coffeeAmount >= cappucinoCoffeeRequired &&
                lowLactoseAmount >= cappucinoMilkRequired &&
                coffeeAmount >= cappucinoMilkRequired &&
                milkAmount >= cappucinoMilkRequired &&
                coffeeAmount >= cappucinoCoffeeRequired) {
            isBlocked = false;
            if (!isBlocked) {
                System.out.println("Готовим кофе");
                milkAmount = milkAmount - cappucinoMilkRequired;
                skimmedMilkAmount = skimmedMilkAmount - cappucinoMilkRequired;
                lowLactoseAmount = lowLactoseAmount - cappucinoMilkRequired;
                coffeeAmount = coffeeAmount - cappucinoCoffeeRequired;
                count++;
                System.out.println(count);
                System.out.println(coffeeAmount);
                System.out.println(milkAmount);
                System.out.println(skimmedMilkAmount);
                System.out.println(lowLactoseAmount);

            } else System.out.println("Кофе машина заблокированна");
        }
        isBlocked = true;
        System.out.println("сырье закончилось, машина заблокированна");

    }
}