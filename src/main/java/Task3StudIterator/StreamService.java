package Task3StudIterator;

import java.awt.*;
import java.util.*;
import java.util.List;

public class StreamService {
    private Stream streamList;
    private String prof;

    public StreamService(Stream streamList, String prof) {
        this.streamList = streamList;
        this.prof = prof;
    }

    public Stream getStreamList() {
        return streamList;
    }

    public void setStreamList(Stream streamList) {
        this.streamList = streamList;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }
    public List<StudentGroup> getSortedStream() {
        List<StudentGroup> studentGroups = new ArrayList<>(streamList.getStreamList());
        Collections.sort(studentGroups, Comparator.comparing(studentGroup -> 1));
        return studentGroups;
    }
}
