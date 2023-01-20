package List_Set_Map;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class PuntoB {
    public static void main(String[] args) {
        
        // for 
        System.out.println("Con for: ");
        Set<String> set1 = new HashSet<>(Arrays.asList("item1", "item2", "item3"));
        Iterator<String> iterator1 = set1.iterator();
        
        for (int i = 0; i < set1.size(); i++) {
            if (iterator1.hasNext()){
                System.out.println(iterator1.next());
            }
        }
        System.out.println("");
        
        // foreach 
        System.out.println("Con forEach: ");
        Set<String> set2 = new HashSet<>(Arrays.asList("item1", "item2", "item3"));

        for (String item : set2) {
            System.out.println(item);
        }
        System.out.println("");
   
        // while 
        System.out.println("Con while: ");
        Set<String> set3 = new HashSet<>(Arrays.asList("item1", "item2", "item3"));
        Iterator<String> iterator2 = set3.iterator();

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        System.out.println("");

        // do while
        System.out.println("Con do while: ");
        Set<String> set4 = new HashSet<>(Arrays.asList("item1", "item2", "item3"));
        Iterator<String> iterator3 = set4.iterator();

        do {
            System.out.println(iterator3.next());
        } while (iterator3.hasNext());
    }
}
