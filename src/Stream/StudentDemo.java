package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentDemo {
    public static void main(String[] args) {

        //获取所有年龄20岁以下的学生
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,19,"张三","M",true));
        students.add(new Student(1,18,"李四","M",false));
        students.add(new Student(1,21,"王五","F",true));
        students.add(new Student(1,20,"赵六","F",false));
        List<String> result= students.stream().filter(student -> student.getAge()<20).map(Student::getName).collect(Collectors.toList());
        System.out.println(result);
        //result.
    }
}