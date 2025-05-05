package arrayPrac;

import java.util.*;
import java.util.stream.Collectors;

public class findMissing {
    public static void findMissingValue(int a[],int b[]){
        HashSet<Integer> aSet= (HashSet<Integer>) Arrays.stream(a)  // IntStream
                .boxed()           // convert int to Integer
                .collect(Collectors.toSet());
        HashSet<Integer> bSet=(HashSet<Integer>) Arrays.stream(b)  // IntStream
                .boxed()           // convert int to Integer
                .collect(Collectors.toSet());
        aSet.removeAll(bSet);
        System.out.println(aSet);

    }
}
