public class GearBox {
    private int gear = 0;
//    0 - neutral
//    1 -rear
//    1-6
    private int maxGear = 6;
    private int minGear = 1;
    public void shiftUp(){
        gear = gear < maxGear ? gear +1 : gear;
    }
    public void shiftDown(){
        gear = gear >= minGear ? gear -1: gear;
    }
    public void switchRear (){
        gear = gear > 1 ? gear: -1;
    }
    public void switchNeutral() {
        gear = 0;
    }
    public int getCurrentGear(){
        return gear;
    }

}
