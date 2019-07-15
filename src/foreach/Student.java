package foreach;

public class Student {

    String name = "", address = "";
    int age = 22, id = 1;

    public Student(String name, String address, int age, int id) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
