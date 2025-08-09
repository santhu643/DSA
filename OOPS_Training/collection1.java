import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;

public class collection1 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        Collection<String> extraFruits = new ArrayList<>();
        extraFruits.add("Mango");
        extraFruits.add("Orange");
        
        list.addAll(extraFruits);
        
        System.out.println(list.contains("Apple"));
        System.out.println(list.containsAll(Arrays.asList("Banana", "Cherry")));
        
        System.out.println(list.isEmpty());
        
        System.out.println(list.size());
        
        list.remove("Banana");
        list.removeAll(Arrays.asList("Mango", "Orange"));
        
        list.retainAll(Arrays.asList("Apple", "Cherry"));
        









        
        list.clear();
        
        System.out.println(list.isEmpty());
    }
}
