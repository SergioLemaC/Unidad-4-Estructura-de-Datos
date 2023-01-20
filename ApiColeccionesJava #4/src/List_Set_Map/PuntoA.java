package List_Set_Map;
import java.util.Arrays;
import java.util.List;

public class PuntoA {
    public static void main(String[] args) {
        // for 
        System.out.println("Con for:");
        List<String> listFor = Arrays.asList("item1", "item2", "item3");
        
        for (int i = 0; i < listFor.size(); i++) {
            System.out.println(listFor.get(i));
        }
        System.out.println("");
        
        // foreach 
        System.out.println("Con forEach: ");
        List<String> listForeach = Arrays.asList("item1", "item2", "item3");

        for (String item : listForeach) {
            System.out.println(item);
        }
        System.out.println("");
        
        // while 
        System.out.println("Con while:");
        List<String> listWhile = Arrays.asList("item1", "item2", "item3");
        int i = 0;

        while (i < listWhile.size()) {
            System.out.println(listWhile.get(i));
            i++;
        }
        System.out.println("");
        
        // do while 
        System.out.println("Con do while:");
        List<String> listDoWhile = Arrays.asList("item1", "item2", "item3");
        int j = 0;

        do {
            System.out.println(listDoWhile.get(j));
            j++;
        } while (j < listDoWhile.size());
    }
}
