package Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class StreamTest1 {
    public static void main(String[] args) {
        List<Integer> age= Arrays.asList(1,2,3,1,4,8,4,13);
        age.stream().filter(x->x>4).forEach(System.out::println);

    }
}
