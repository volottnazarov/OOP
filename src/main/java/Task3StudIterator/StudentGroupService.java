package Task3StudIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;
    private int numberGroup;
    private String litteraGroup;

    public StudentGroupService(StudentGroup studentGroup, int numberGroup, String litteraGroup) {
        this.studentGroup = studentGroup;
        this.numberGroup = numberGroup;
        this.litteraGroup = litteraGroup;
    }


    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public String getLitteraGroup() {
        return litteraGroup;
    }

    public void setLitteraGroup(String litteraGroup) {
        this.litteraGroup = litteraGroup;
    }

    public List<Student> getSortedStudentGroup(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentGroupByFIO(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new StudentComparator());
        return studentList;
    }
}