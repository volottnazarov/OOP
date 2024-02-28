package Task4Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
        Student student1 = new Student(1L, "SSS", "ddd", "eee");
        Student student2 = new Student(2L, "sss", "DDd", "RRR");
        Student student3 = new Student(3L, "www", "dSD", "tTT");
        Student student4 = new Student(4L, "WWW", "ssd", "Qqw");

        //UserView<Student> us = new StudentView();
        //List<Student> studentList = new ArrayList<>(Arrays.asList(student1, student2, student3, student4));
        //us.sendOnConsole(studentList);

        Teacher teacher1 = new Teacher(1L, "Yoda", "qqq", "ttt");
        Teacher teacher2 = new Teacher(2L, "Lee", "qWW", "RRt");
        Teacher teacher3 = new Teacher(3L, "Fucker", "Upr", "kkL");
        Teacher teacher4 = new Teacher(4L, "Стас", "Ооо", "ееЕ");
        TeacherView teach = new TeacherView();
        List<Teacher> teacherList = new ArrayList<>(Arrays.asList(teacher1, teacher2, teacher3, teacher4));
        teach.sendOnConsole(teacherList);

        TeacherService teacherService = new TeacherService(teacherList);
        System.out.println(teacherService.getSortedTeachersByFIO());
        System.out.println("---------------------------------------------");
        System.out.println(teacherService.getSortedTeachers());
    }
}
