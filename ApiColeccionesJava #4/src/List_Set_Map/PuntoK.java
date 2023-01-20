package List_Set_Map;

import java.util.Arrays;
import java.util.List;

public class PuntoK {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("item1", "item2", "item3");
        String[] array = list.toArray(new String[0]);
        
        for (int i = 0; i < list.size(); i++){
            System.out.println(array[i]);
        }
    }
}
