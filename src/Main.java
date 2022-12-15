import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Integer массивден жуп 
                сандарды терип алынызда
                алардын квадраттарынын
                эн чонун табыныз.
                """);
        List<Integer> integers =new ArrayList<>(Arrays.asList(
                2,3,4,5,6,7,8,9
        ));
        integers.stream().filter(integer -> integer%2 == 0)
                .toList().stream().map(integer -> integer * integer)
                .toList().stream().max(Comparator.comparing(Integer::intValue))
                .ifPresent(System.out::println);

    }
}