package Task4Generic;

public class Teacher extends User implements Comparable<Teacher>{
    private Long teacherId;

    public Teacher(Long teacherId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }
    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId= " + teacherId + ". " +
                super.getFirstName() + " " +
                super.getSecondName() + " " +
                super.getLastName() + " " +
                '}';
    }
    @Override
    public int compareTo(Teacher o) {
        if (this.teacherId > o.teacherId)
            return 1;
        if (this.teacherId < o.teacherId)
            return -1;
        return 0;
    }
}
