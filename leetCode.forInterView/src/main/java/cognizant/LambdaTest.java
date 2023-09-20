package cognizant;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaTest {

    public static void main(String[] args) {
        List<Integer> intList = List.of(1,2,3,4,456,4576,34,34,56645,234);

        intList = intList.stream().sorted().collect(Collectors.toList());

        System.out.println(Arrays.toString(intList.toArray()));
    }
}
