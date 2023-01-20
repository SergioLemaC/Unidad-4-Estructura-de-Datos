package List_Set_Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PuntoC {
    public static void main(String[] args) {
        // for 
        System.out.println("Con for: ");
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("item1", 1);
        map1.put("item2", 2);
        map1.put("item3", 3);

        Iterator<Map.Entry<String, Integer>> iterator1 = map1.entrySet().iterator();
        for (int i = 0; i < map1.size(); i++) {
            if (iterator1.hasNext()) {
                Map.Entry<String, Integer> entry = iterator1.next();
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }
        System.out.println("");

        // foreach 
        System.out.println("Con forEach: ");
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("item1", 1);
        map2.put("item2", 2);
        map2.put("item3", 3);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("");

        
        // while
        System.out.println("Con while: ");
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("item1", 1);
        map3.put("item2", 2);
        map3.put("item3", 3);
        Iterator<Map.Entry<String, Integer>> iterator3 = map3.entrySet().iterator();

        while (iterator3.hasNext()) {
            Map.Entry<String, Integer> entry = iterator3.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("");

        
        // do while 
        System.out.println("Con do while: ");
        Map<String, Integer> map4 = new HashMap<>();
        map4.put("item1", 1);
        map4.put("item2", 2);
        map4.put("item3", 3);
        Iterator<Map.Entry<String, Integer>> iterator4 = map4.entrySet().iterator();

        do {
            Map.Entry<String, Integer> entry = iterator4.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        } while (iterator4.hasNext());
    }
}
