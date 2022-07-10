import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Calculate {

    public static<T>  Set<T> union(HashSet<T> set1, HashSet<T> set2) {
        return Stream.concat(set1.stream(), set2.stream()).collect(Collectors.toSet());

    }

    public static<T>  Set<T> intersection(HashSet<T> set1, HashSet<T> set2) {
        return set1.stream().filter(set2::contains).collect(Collectors.toSet());
    }

    public static <T>  Set<T> minus(HashSet<T> set1, HashSet<T> set2) {
        return set1.stream().filter(set2::add).collect(Collectors.toSet());

    }

    public static <T>  Set<T> difference(HashSet<T> set1, HashSet<T> set2) {
        return Stream.concat(minus(set1, set2).stream(), minus(set2, set1).stream()).collect(Collectors.toSet());
    }
}
