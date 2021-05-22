package Java_1.lesson5;


public class Employee {
    private final String name;
    private final String position;
    private final String email;
    private final String tel;
    private final int salary;
    private final int age;


    public Employee(String name, String position, String email, String tel, String salary, String age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = Integer.parseInt(salary);
        this.age = Integer.parseInt(age);
    }


    public void printInfo() {
//        1 вариант
        System.out.println(this);
//        2 вариант
//        System.out.println(toString());
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

}
