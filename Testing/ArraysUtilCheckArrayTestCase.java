import Java_3.j3_lesson6.ArraysUtil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ArraysUtilCheckArrayTestCase {
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
    @MethodSource("TestingDataSource#data_for_checking_array_operation")
    public void test__check_numbers_in_array__params(Integer[] array, Boolean result) {
        Assertions.assertEquals(result, arraysUtil.checkNumbersInArray(array, 1, 4));
    }



//    Testing exceptions
    @Test
    public void test__check_numbers_in_array__null_pointer_ex() {
        Assertions.assertThrows(RuntimeException.class, () -> arraysUtil.checkNumbersInArray(null, 1, 4));
    }

}
