import java.util.*;

public class APIs_and_Lambdas {
 public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    System.out.println(set.add(66));
    System.out.println(set.add(66));
    System.out.println(set.size());
    set.remove(66);
    System.out.println(set.isEmpty());

    Map<String, String> map = new HashMap<>();
    map.put("Koala", "Bamboo");
    String other = map.getOrDefault("ant", "leaf");
    for (String key: map.keySet())
        System.out.println(key + " " + map.get(key));
    


 }
}
