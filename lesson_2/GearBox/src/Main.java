public class Main {
    public static void main(String[] args) {
        GearBox gearBox = new GearBox();
        gearBox.shiftUp();
        System.out.println(gearBox.getCurrentGear());
    }
}