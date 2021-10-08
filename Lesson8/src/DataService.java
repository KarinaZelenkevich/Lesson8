public interface DataService {
    void add(String text) throws LowMemory;
    String get() throws EmptyMemory;
}
