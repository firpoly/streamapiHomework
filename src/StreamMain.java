import java.util.Comparator;
import java.util.stream.Stream;

public class StreamMain {
    public void workStreamAPI(Stream<Integer> stream) {
        stream.filter(x -> x > 0).
                filter(x -> x % 2 == 0).
                sorted(Comparator.naturalOrder()).
                forEach(System.out::println);
    }
}
