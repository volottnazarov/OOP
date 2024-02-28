package Task4Generic;

import java.util.List;

public class TeacherView implements UserView<Teacher>{
    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher t : list) {
            System.out.println(t);
        }
    }
}
