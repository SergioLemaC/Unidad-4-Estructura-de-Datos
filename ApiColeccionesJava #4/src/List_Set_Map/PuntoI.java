package List_Set_Map;
import java.util.HashMap;
import java.util.Map;

public class PuntoI {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("item1", 1);
        map.put("item2", 2);
        map.put("item3", 3);

        map.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
    }
}
