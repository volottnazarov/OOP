package Task3StudIterator;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> studentList;
    private int numberGroup;
    private String litteraGroup;


    public StudentGroup(List<Student> studentList, int numberGroup, String litteraGroup) {

        this.studentList = studentList;
        this.numberGroup = numberGroup;
        this.litteraGroup = litteraGroup;
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

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    public void addStudent(Student student){
        studentList.add(student);
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "studentList=" + studentList +
                ", numberGroup=" + numberGroup +
                ", litteraGroup='" + litteraGroup + '\'' +
                '}';
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
