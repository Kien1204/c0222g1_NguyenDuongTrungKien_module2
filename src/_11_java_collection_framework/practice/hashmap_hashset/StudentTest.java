package _11_java_collection_framework.practice.hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentTest extends Student {
    public StudentTest(String ha, int i, String hn) {
    }
    public static void main(String[] args) {
        StudentTest student1 = new StudentTest("Nam",20, "HN");
        StudentTest student2 = new StudentTest("Hung",21, "HN");
        StudentTest student3 = new StudentTest("Ha",22, "HN");

        Map<Integer, StudentTest> studentMap = new HashMap<Integer, StudentTest>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);

        for(Map.Entry<Integer, StudentTest> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("...........Set");
        Set<StudentTest> students = new HashSet<StudentTest>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for(StudentTest student : students){
            System.out.println(student.toString());
        }
    }
}
