package lesson5;

public class Employee {
    private final String name;
    private final String position;
    private final String email;
    private final String tel;
    private final int salary;
    private final int age;


    public Employee(String[] dataArr) {
        this.name = dataArr[0];
        this.position = dataArr[1];
        this.email = dataArr[2];
        this.tel = dataArr[3];
        this.salary = Integer.parseInt(dataArr[4]);
        this.age = Integer.parseInt(dataArr[5]);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }


    public String getName() {
        return this.name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

}
