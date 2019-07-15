package lamda;

public interface InterfaceDisplay {
    default void showMessage(String pStr){
        System.out.println("dd"+pStr);
    }
    void displayMsg(String pMsg);
}
