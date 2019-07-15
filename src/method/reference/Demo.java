package method.reference;

public class Demo {
    String mStr;

    Demo() {
    }

    Demo(String pStr) {
        mStr = pStr;
        System.out.println(pStr);
    }

    public void displayMessage(String pStr) {
        System.out.println(pStr);
    }

    public void interfaceConcept(Simple simple){
        simple.showMessage("Hi this is method reference");
    }
}
