package Task3StudIterator;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(4, "aab", "aab", "aab");
        Student student2 = new Student(2, "aaa", "aaa", "aaa");
        Student student3 = new Student(3, "Aaa", "Aaa", "Aaa");
        Student student4 = new Student(1, "bbb", "bbb", "bbb");
        List<Student> studentList1 = new ArrayList<>();
        List<Student> studentList2 = new ArrayList<>();
        List<Student> studentList3 = new ArrayList<>();
        List<Student> studentList4 = new ArrayList<>();
        studentList1.add(student1);
        studentList2.add(student2);
        studentList3.add(student4);
        studentList4.add(student3);
        StudentGroup studentGroup1 = new StudentGroup(studentList1, 1, "C");
        StudentGroup studentGroup2 = new StudentGroup(studentList3, 3, "A");
        StudentGroup studentGroup3 = new StudentGroup(studentList2, 2, "D");
        StudentGroup studentGroup4 = new StudentGroup(studentList4, 4, "B");
        List<StudentGroup> streamList1 = new ArrayList<>();
        List<StudentGroup> streamList2 = new ArrayList<>();
        streamList1.add(studentGroup1);
        streamList2.add(studentGroup2);
        streamList2.add(studentGroup4);
        streamList2.add(studentGroup3);

        Stream math = new Stream(streamList1, "Math");
        Stream humanit = new Stream(streamList2, "Humanitar");
        System.out.println("Math " + math);
        System.out.println("Humanitar " + humanit);
        System.out.println("-------------------------------");
        StreamIterator iterator = new StreamIterator(math);
        while (iterator.hasNext()){
            System.out.println("Math Stream : " + iterator.next());
        }
        StreamIterator iterator1 = new StreamIterator(humanit);
        while (iterator1.hasNext()){
            System.out.println("Humanitar Stream : " + iterator1.next());
        }

        StreamComparator comparator = new StreamComparator();
        System.out.println(comparator.compare(math, humanit));
        System.out.println("------------------------------------------");

        StreamService service = new StreamService(humanit, humanit.getProf());
        for (StudentGroup studentGroup  : humanit) {
            System.out.println(studentGroup);
        }
        System.out.println("-------------------------------------------");
        for (StudentGroup studentGroup : service.getStreamList()) {
            System.out.println(studentGroup);
        }

    }
}
