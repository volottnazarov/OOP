package Task4Generic;

import java.util.List;

public interface UserView <T extends User>{
    public void sendOnConsole(List<T> list);
}
