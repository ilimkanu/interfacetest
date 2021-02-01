public class Mi8 extends Helicopter implements VerticalTakeOff{
    @Override
    public void fly() {
        System.out.println("Mi8");
    }

    @Override
    public void verticalTakeOff() {
        System.out.println("Helicopter Mi8 vertical");
    }
}
