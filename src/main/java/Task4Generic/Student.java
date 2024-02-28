package Task4Generic;

public class Student extends User implements Comparable<Student>{
    public Long studentId;

    public Student(Long studentId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId= " + studentId + ". " +
                super.getFirstName() + " " +
                super.getSecondName() + " " +
                super.getLastName() + " " +
                '}';
                 // либо: + studentId + super.toString() +'}';
    }


    @Override
    public int compareTo(Student o) {
        if (this.studentId > o.studentId)
            return 1;
        if (this.studentId < o.studentId)
            return -1;
        return 0;
        //this.studentId.compareTo(o.studentId);
    }
}
