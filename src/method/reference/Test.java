package method.reference;

public class Test {


    static void displayMessage(String pStr){
        System.out.println(pStr);
    }

    public static void main(String args[]){
        //Static method reference
        Simple lSimpleStaticMR = Test::displayMessage;
        lSimpleStaticMR.showMessage("Hi this is static Method reference");

        //Instance method
        Simple lSimmpleInstanceMR = new Demo()::displayMessage;
        lSimmpleInstanceMR.showMessage("Hi this is Instance method reference");

        //Constructor method reference
        Simple lSimpleConstructorMR = Demo::new;
        lSimpleConstructorMR.showMessage("Hi this is Constructor method reference");

        //Try something new
        new Demo().interfaceConcept(Test::displayMessage);

    }

}
