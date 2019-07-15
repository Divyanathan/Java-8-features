package stream;

import foreach.Student;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

    List<Employee> mEmployeeList;
    HashMap<Integer, Employee> mEmployeeMap;


    public Demo(List<Employee> pEmployeeList, HashMap<Integer, Employee> pEmployeeMap) {
        mEmployeeMap  = pEmployeeMap;
        mEmployeeList = pEmployeeList;
    }

    /**
     * This method performs the filter option
     */
    void usingFilter() {
        System.out.println("------usingFilter------ " );
        List<Employee> lList = new ArrayList<>();
        mEmployeeList.stream()
                .filter(lEmployee -> {
                    if (lEmployee.getSalary() >= 15000 && lEmployee.getAge() >= 20) {
                        System.out.println("Emp Id"+lEmployee.getId());
                        lList.add(lEmployee);
                        return true;
                    } else return false;
                })
                .forEach(lEmployee -> {
                    System.out.println("ID   ==>"  + lEmployee.getId());
                    System.out.println("Name ==> " + lEmployee.getName());
                    System.out.println("Sal  ==> " + lEmployee.getSalary());
                    System.out.println("Age  ==>"  + lEmployee.getAge());
                    System.out.println();
                });
                System.out.println(lList.size());
    }

    /**
     * This method checks the whether the condition satisfy in all the Employee
     */
    void usingAllMatch() {
        System.out.println("\n------usingAllMatch------ " );
        System.out.println("Sal>=10000 && Age>=20 "+mEmployeeList.stream().allMatch(lEmployee -> {
            if (lEmployee.getSalary() >= 10000 && lEmployee.getAge() >= 20) {
                return true;
            } else return false;
        }));

        System.out.println("Sal>=12000 && Age>=20 "+mEmployeeList.stream().allMatch(lEmployee -> {
            if (lEmployee.getSalary() >= 12000 && lEmployee.getAge() >= 20) {
                return true;
            } else return false;
        }));

    }

    /**
     * This method checks the whether the condition satisfy in one employee satisfy the condition
     */
    void usingAnyMatch() {
        System.out.println("\n------usingAnyMatch------ " );
        System.out.println("Sal>=10000 && Age>=20 && id=8 "+mEmployeeList.stream().anyMatch(lEmployee -> {
            if (lEmployee.getSalary() >= 10000 && lEmployee.getAge() >= 20 && lEmployee.getId()==8) {
                return true;
            } else return false;
        }));

        System.out.println("Sal>=18000 && Age>=20 && id=3 "+mEmployeeList.stream().anyMatch(lEmployee -> {
            if (lEmployee.getSalary() >= 18000 && lEmployee.getAge() >= 20 && lEmployee.getId()==3) {
                return true;
            } else return false;
        }));
    }

    void usingMap() {
        System.out.println("\n------usingMap------ ");

        //Printing single value
       mEmployeeList.stream()
                .filter(lEmployee->lEmployee.getSalary()>15000)
                .collect(Collectors.toMap(lEmpl -> lEmpl.getId(), lEmployee-> {
                        return new Student(lEmployee.getName(),lEmployee.getAddress(),lEmployee.getAge(),lEmployee.getId());
                })).forEach((i,lStudent)->{
                    System.out.println("ID   ==>" + lStudent.getId());
                    System.out.println("Name ==>" + lStudent.getName());
                    System.out.println("Age  ==>" + lStudent.getAge());
                    System.out.println();
               });

        //Printing multiple value
        mEmployeeList.stream().map(new Function<Employee, Object>() {

            @Override
            public Object apply(Employee employee) {
                return new HashMap<>().put(employee.getId(),employee.getName());
            }
        });

    }
}
