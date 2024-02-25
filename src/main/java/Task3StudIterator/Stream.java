package Task3StudIterator;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{

    private List<StudentGroup> streamList;
    private String prof;


    public Stream(List<StudentGroup> streamList, String prof) {
        this.streamList = streamList;
        this.prof = prof;
    }

    public List<StudentGroup> getStreamList() {
        return streamList;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public void setStreamList(List<StudentGroup> streamList) {
        this.streamList = streamList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    @Override
    public String toString() {
        return "Stream{" +
                "streamList=" + streamList +
                ", prof='" + prof + '\'' +
                '}';
    }
}
