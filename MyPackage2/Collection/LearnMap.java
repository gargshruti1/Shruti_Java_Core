package MyPackage2.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
   public static void main(String args[]){
      // Map<Integer , String> name = new HashMap<>();
     Map<Integer , String> name = new TreeMap<>(); // if we want in sorted order
      name.put(1, "Ram");
      name.put(7, "am");
      name.put(3, "Ream");
      name.put(8, "Rarm");
      name.put(5, "Ramr");
      name.putIfAbsent(2, "shyam");
      System.out.println(name);
      System.out.println(name.containsKey(3));
      System.out.println(name.containsValue("hj"));
      System.out.println(name.isEmpty());
      for (Map.Entry<Integer , String>e:name.entrySet())
         System.out.println(e);
   }
   }
