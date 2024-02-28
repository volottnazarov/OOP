package Task4Generic;

import java.util.Comparator;

public class TeacherComparator <T extends Teacher>implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0) {
                resultOfComparing = o1.getLastName().compareTo(o2.getLastName());
                return o1.getTeacherId().compareTo(o2.getTeacherId());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}
