package interfaces;

public interface Display {

    default void displayString(String pStr){
        System.out.println("This is Display "+pStr);
    }
}
