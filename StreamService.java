import java.util.List;

public class StreamService {
    private List<Stream> streams;

    public StreamService(List<Stream> streams) {
        this.streams = streams;
    }

    public List<Stream> getSortedStreamBySize(List<Stream> streamList){
        streamList.sort(new StreamComparator());
        return streamList;
    }
}
