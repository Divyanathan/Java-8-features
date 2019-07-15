package stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {


    public static void main(String pArgs[]) {

        List<Employee> lEmployeeList             = new ArrayList<>();
        HashMap<Integer, Employee> lEmployeeMap  = new HashMap<>();

        int age    = 20;
        int salary = 10000;

        for (int i = 0; i < 10; i++) {
            lEmployeeList.add(new Employee("name" + (i + 1), "address" + (i + 1), ++age, i + 1, salary));
            lEmployeeMap.put(i + 1, lEmployeeList.get(i));
            salary += 1000;
        }

        Demo lDemo = new Demo(lEmployeeList, lEmployeeMap);
//        lDemo.usingFilter();
////        lDemo.usingAllMatch();
////        lDemo.usingAnyMatch();
        lDemo.usingMap();
    }

}
