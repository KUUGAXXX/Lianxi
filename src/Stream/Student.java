package Stream;

public class Student {
    private int salary; // 组
    private int age; // 年龄
    private String name;  // 姓名
    private String sex; //性别
    private Boolean xxx;  // boolean

    public Student(int salary, int age, String name, String sex, Boolean xxx) {
        this.salary = salary;
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.xxx = xxx;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Boolean getXxx() {
        return xxx;
    }

    public void setXxx(Boolean xxx) {
        this.xxx = xxx;
    }
}
