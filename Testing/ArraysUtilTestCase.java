import Java_3.j3_lesson6.ArraysUtil;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ArraysUtilTestCase {
    private ArraysUtil arraysUtil;

    @BeforeEach
    public void create_obj() {
        arraysUtil = new ArraysUtil();
    }

    @AfterEach
    public void clean() {
        arraysUtil = null;
    }


//    Testing set of params
    @ParameterizedTest
    @MethodSource("TestingDataSource#data_for_getting_items_operation")
    public void test__get_items_after_value__params(Integer[] array, Integer[] result) {
        Assertions.assertArrayEquals(result, arraysUtil.getItemsAfterValue(array, 4));
    }


//    Testing exceptions
    @Test
    public void test__get_items_after_value__no_value_in_array() {
        Integer[] arrWithNoValue = {1, 2, 3, 5, 6, 7, 8};
        int value = 4;
        Assertions.assertThrows(RuntimeException.class, () -> arraysUtil.getItemsAfterValue(arrWithNoValue, value));
    }

    @Test
    public void test__get_items_after_value__null_pointer_ex() {
        Assertions.assertThrows(RuntimeException.class, () -> arraysUtil.getItemsAfterValue(null, 4));
    }

}
