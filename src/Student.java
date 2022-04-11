
import java.util.*;

public class Student {

    private int id;
    private String name;
    private List<Integer> marks;
    private Map resultMap = new HashMap();

    public Student(int id, String name, List<Integer> marks) {
        this.id = id;

        this.name = name;
        this.marks = marks;
    }

    public void getResult(List<Integer> mark, int id){
        int addition=0;
        for (Integer i: mark) {
            addition = addition+i;
        }
        int average = addition/mark.size();
        resultMap.put(id,average);

    }
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(100,80,90,70,95);
        List<Integer> list1 = Arrays.asList(70,80,70,70,50);
        Student student1 = new Student(1,"Student1", list);
        Student student2 = new Student(1,"Student2", list1);
        List<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        for (Student student : students) {
            student.getResult(student.marks,student.id);
        }
        for (Student student : students) {
            System.out.println(student.resultMap);
        }
    }

}
