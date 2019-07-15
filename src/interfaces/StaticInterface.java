package interfaces;

public interface StaticInterface {

    static int a = 10;

    static void staticMethodValue(){
        System.out.println("The static values "+a);
    }
}
