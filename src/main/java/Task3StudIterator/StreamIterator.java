package Task3StudIterator;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private List<StudentGroup> streamList;
    private int counter;
    public StreamIterator(Stream streamList){
        this.streamList = streamList.getStreamList();
        counter = 0;
    }
    @Override
    public boolean hasNext() {
        return counter < streamList.size();
    }

    @Override
    public StudentGroup next() {
        if(hasNext()){
            return streamList.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        if(hasNext()){
            streamList.remove(counter);
        }

    }
}
