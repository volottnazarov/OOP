package Task4Generic;

import java.util.List;

public class StudentView implements UserView<Student>{
    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student user : list) {
            System.out.println(user);

        }
    }
}
