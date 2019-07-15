package interfaces;

public interface Calculation {

    default void displayString(String pStr){
        System.out.println("This is Calculation interface "+pStr);
    }
}
