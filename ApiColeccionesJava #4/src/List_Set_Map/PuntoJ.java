package List_Set_Map;

import java.util.Arrays;
import java.util.List;

public class PuntoJ {
    public static void main(String[] args) {
        String[] array = {"item1", "item2", "item3"};
        List<String> list = Arrays.asList(array);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
