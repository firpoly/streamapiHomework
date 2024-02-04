import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public void workStreamAPI(Stream<Integer> stream) {
        stream.filter(x -> x > 0).
                filter(x -> x % 2 == 0).
                sorted(Comparator.naturalOrder()).
                forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Stream<Integer> stream = intList.stream();
        StreamMain workStream = new StreamMain();
        System.out.println("работа c Stream API");
        workStream.workStreamAPI(stream);
    }
}
