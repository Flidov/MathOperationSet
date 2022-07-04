import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Calculate {

    public static Set<Given>  union(HashSet<Given> set1, HashSet<Given> set2) {
        return Stream.concat(set1.stream(), set2.stream()).collect(Collectors.toSet());
    }
    public static Set<Given>  intersection (HashSet<Given> set1, HashSet<Given> set2){
        return set1.stream().filter(set2::contains).collect(Collectors.toSet());
     }
    public static Set<Given>  minus (HashSet<Given> set1, HashSet<Given> set2){
        return set1.stream().filter(set2::add).collect(Collectors.toSet());

    }
      public static Set<Given>  difference (HashSet<Given> set1, HashSet<Given> set2){
        return  Stream.concat(minus(set1,set2).stream(),minus(set2,set1).stream()).collect(Collectors.toSet());
      }
}
