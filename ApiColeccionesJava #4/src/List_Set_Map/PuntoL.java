package List_Set_Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PuntoL {
    public static void main(String[] args) {
        // forma No. 1 
        System.out.println("Fomra No 1: ");
        List<String> list1 = Arrays.asList("item1", "item2");
        List<String> list2 = Arrays.asList("item3", "item4");
        List<String> combinedList = new ArrayList<>(list1);
        combinedList.addAll(list2);
        
        for (int i = 0; i < combinedList.size(); i++){
            System.out.println(combinedList.get(i));
        }
        System.out.println("");
        
        // forma No. 2 
        System.out.println("Forma No 2: ");
        List<String> list3 = Arrays.asList("item1", "item2");
        List<String> list4 = Arrays.asList("item3", "item4");
        List<String> combinedList2 = Stream.concat(list3.stream(), list4.stream()).collect(Collectors.toList());
        
        for (int i = 0; i < combinedList2.size(); i++){
            System.out.println(combinedList2.get(i));
        }
    }
}
