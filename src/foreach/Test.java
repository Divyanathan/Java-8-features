package foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.SortedMap;

public class Test {

    public static void main(String pArgs[]) {
        List<Student> studentList = new ArrayList<>();
        HashMap<Integer, Student> lStudentMap = new HashMap<>();
        int age = 20;
        for (int i = 0; i < 10; i++) {
            studentList.add(new Student("name" + (i + 1), "address" + (i + 1), ++age, i + 1));
            lStudentMap.put(i + 1, studentList.get(i));
        }


        //Printing all the values
        studentList.forEach(lStudent -> {
            System.out.println("ID      --> " + lStudent.getId());
            System.out.println("Name    --> " + lStudent.getName());
            System.out.println("Address --> " + lStudent.getAddress());
            System.out.println("Age     --> " + lStudent.getAge());
            System.out.println();
        });

        //Printing the value which satisfy the condition
        studentList.forEach(lStudent -> {
            if (lStudent.id == 10) {
                System.out.println("Found the value");
                System.out.println("ID      --> " + lStudent.getId());
                System.out.println("Name    --> " + lStudent.getName());
                System.out.println("Address --> " + lStudent.getAddress());
                System.out.println("Age     --> " + lStudent.getAge());
                System.out.println();
            }
        });

        //Trying out Map
        System.out.println("Map Value");
        lStudentMap.forEach((i, lStudent) -> {
            System.out.println("ID      --> " + lStudent.getId());
            System.out.println("Name    --> " + lStudent.getName());
            System.out.println("Address --> " + lStudent.getAddress());
            System.out.println("Age     --> " + lStudent.getAge());
            System.out.println();
        });
    }
}
