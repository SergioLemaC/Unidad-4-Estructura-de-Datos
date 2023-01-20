package List_Set_Map;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PuntoE {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("item1", "item2", "item3"));
        set.stream().forEach(System.out::println);
    }
}
