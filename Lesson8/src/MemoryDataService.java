import java.util.ArrayList;
import java.util.List;

public class MemoryDataService implements  DataService{

    private List<String> list = new ArrayList<>();

    @Override
    public void add(String text) throws LowMemory {
       if (list.size()>4) {
           throw new LowMemory();
       } else {
           list.add(text);
       }
    }

    @Override
    public String get() throws EmptyMemory {
       if (list.size() < 1) {
           throw new EmptyMemory();
       } else {
           return list.remove(1);
       }
    }


}
