import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private List<StudentGroup> studentGroupList;
    private int count;

    public StreamIterator(Stream stream) {
        this.studentGroupList = stream.getStudentGroupList();
        count = 0;
    }

    @Override
    public boolean hasNext() {
        return count < studentGroupList.size();
    }

    @Override
    public StudentGroup next() {
        if(hasNext()){
            return studentGroupList.get(count++);
        }
        return null;
    }

    @Override
    public void remove() {
        if(hasNext())
            studentGroupList.remove(count);
    }
}
