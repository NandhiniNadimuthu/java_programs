
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {

    private int id;
    private String name;
    private List<Integer> marks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public Student(int id, String name, List<Integer> marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getResult(List<Integer> mark, int id){
        int addition=0;
        for (Integer i: mark) {
            addition = addition+i;
        }
        int average = addition/mark.size();
        return average;
    }
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(100,80,90,70,95);
        List<Integer> list1 = Arrays.asList(70,80,70,70,50);
        Student student1 = new Student(1,"Student1", list);
        Student student2 = new Student(2,"Student2", list1);
        List<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        Map<Integer, Integer> result = students.stream().collect(Collectors.toMap(Student::getId, Student -> Student.getResult(Student.marks, Student.id)));
        System.out.println(result);
    }

}
