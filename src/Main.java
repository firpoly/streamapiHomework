import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
        System.out.println("работа без Stream API");
        withoutStreamAPI(intList);
    }
}