import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void withoutStreamAPI(List<Integer> arrays) {
        List<Integer> copyList = new ArrayList<>();
        for (int i = 0; i < arrays.size(); i++) {
            if ((arrays.get(i) > 0) && (arrays.get(i) % 2 == 0)){
                copyList.add(arrays.get(i));
            }
        }
        copyList.sort(Comparator.naturalOrder());
        for (Integer item : copyList) {
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Stream<Integer> stream = intList.stream();
        StreamMain workStream = new StreamMain();
        System.out.println("работу без Stream API");
        withoutStreamAPI(intList);
        System.out.println("работу c Stream API");
        workStream.workStreamAPI(stream);
    }
}