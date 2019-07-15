package interfaces;

public class Demo implements Calculation,Display{

    @Override
    public void displayString(String pStr) {
        System.out.println("This is Demo class "+pStr);
        Calculation.super.displayString(pStr);
        Display.super.displayString(pStr);
        System.out.println("Static interface value "+StaticInterface.a);
    }
}
