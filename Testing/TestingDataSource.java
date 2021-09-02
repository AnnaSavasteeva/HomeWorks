import org.junit.jupiter.params.provider.Arguments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestingDataSource {

    public static Stream<Arguments> data_for_getting_items_operation() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new Integer[] {1, 2, 4, 4, 2, 3, 4, 1, 7}, new Integer[] {1, 7}));
        out.add(Arguments.arguments(new Integer[] {2, 3, 4, 5, 6}, new Integer[] {5, 6}));
        out.add(Arguments.arguments(new Integer[] {4, 4, 4}, new Integer[] {}));
        out.add(Arguments.arguments(new Integer[] {4, 3, 2, 1}, new Integer[] {3, 2, 1}));
        out.add(Arguments.arguments(new Integer[] {9, 8, 7, 6, 5, 4}, new Integer[] {}));

        return out.stream();
    }

}
