package Task4Generic;

import Task3StudIterator.StudentComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherService{
    private List<Teacher> teacherList;

    public TeacherService(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    @Override
    public String toString() {
        return "TeacherService{" +
                "teacherList= " + teacherList +
                '}';
    }

    public List<Teacher> getSortedTeachers(){
        List<Teacher> studentList = new ArrayList<>(teacherList);
        Collections.sort(teacherList);
        return studentList;
    }

    public List<Teacher> getSortedTeachersByFIO(){
        List<Teacher> teachList = new ArrayList<>(teacherList);
        teachList.sort(new TeacherComparator<>());
        return teachList;
    }
}
