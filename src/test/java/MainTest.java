import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Richard Wong
 * @date 2022/9/11
 */
class MainTest {
    @Test
    public void test() {
        Main main = new Main();
        main.method();
        Assertions.assertTrue(true);
    }
}