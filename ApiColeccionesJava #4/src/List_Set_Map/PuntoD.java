package List_Set_Map;
import java.util.Arrays;
import java.util.List;

public class PuntoD {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("item1", "item2", "item3");
        list.stream().forEach(System.out::println);
    }
}
