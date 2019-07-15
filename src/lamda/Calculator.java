package lamda;

interface  Calculator {
    default int addition(int a,int b){
        return a+b;
    }
    default int subtraction(int a,int b){
        return a-b;
    }
     int multiplication(int a,int b);
}
