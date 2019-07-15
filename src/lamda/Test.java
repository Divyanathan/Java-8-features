package lamda;

import javax.rmi.CORBA.Util;

public class Test {

    public static void main(String arg[]){
        InterfaceDisplay l = lMsg -> System.out.println(lMsg);
        l.displayMsg("HI");
        l.showMessage("Hello");
    }
}
