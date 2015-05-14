import java.lang.Math.*;

public class HashUtilities {

    public static int shortHash(int n) {
        int result = Math.abs(n) % 1000;
        return result;
    }
}
   
