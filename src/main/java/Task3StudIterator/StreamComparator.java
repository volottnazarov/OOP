package Task3StudIterator;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override

    public int compare(Stream o1, Stream o2) {
        if (o1.getStreamList().size() > o2.getStreamList().size())
            return 1;
        if (o1.getStreamList().size() < o2.getStreamList().size())
            return -1;
        return 0;

    }
}
