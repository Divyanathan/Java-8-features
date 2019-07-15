package stream;

import foreach.Student;

public class Employee extends Student {

    int salary;

    public Employee(String name, String address, int age, int id, int salary) {
        super(name, address, age, id);
        this.salary = salary;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
