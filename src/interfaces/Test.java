package interfaces;

public class Test  {

    public static void  main(String arg[]){
        Demo lDemo = new Demo();
        Calculation lCalculation = new Demo();
//        Display lDisplay = new Demo();
        lDemo.displayString("Hello word");
//        lDisplay.displayString("Hello word");
        System.out.println("Values by calling from maim method ");
        StaticInterface.staticMethodValue();
    }
}
