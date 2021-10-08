
import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        DataService service = new MemoryDataService();
        while (true) {
          String next =   scanner.next();
          if ("exit".equals(next)) {
              break;
          } else if ("get".equals(next)){
              try {
                  System.out.println(service.get());
              }catch (EmptyMemory ex) {
                  System.out.println("No elements");
              }
          } else {
              try {
                  service.add(next);
              } catch (LowMemory e) {
                  System.out.println("Memory is full");
              }
          }
        }
    }

}