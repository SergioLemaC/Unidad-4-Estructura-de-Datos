package List_Set_Map;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PuntoM {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("item1", "item2", "item3", "item4");
        Collections.shuffle(list);

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
