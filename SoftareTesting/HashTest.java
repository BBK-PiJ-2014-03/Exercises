import org.junit.*;
import static org.junit.Assert.*;
import java.util.Random;


public class HashTest {
    @Test
    public void testHashFunction() {
        Random rn = new Random();
        boolean result = true;
        for (int i = 0; i < 10; i++) {
            int randomInt = rn.nextInt();
            System.out.println(randomInt);
            int test = HashUtilities.shortHash(randomInt);
            if (!inRange(test, 0, 999)) {
                result = false;
            }
        }
        assertTrue(result);
    }

    /**
     * Returns true if and only if x is strictly greater than the 
     * lower bound and strictly lower than the upper bound. 
     * 
     * @param x
     * @return
     */
    private boolean inRange(int x, int low, int high) {
        return (x > low && x < high);
    }
}
