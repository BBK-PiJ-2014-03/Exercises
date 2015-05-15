
import java.util.Arrays;

public class ArrayCopierProgram {
    public static void main(String[] args) {
        
        int[] base = {1, 2, 3, 4, 5};
        int[] sameSize = new int[5];
        int[] smaller = new int[3];
        int[] bigger = new int[10];
        
        ArrayCopier test = new ArrayCopier();
        
        System.out.println(Arrays.toString(test.copy(base, sameSize)));
        System.out.println(Arrays.toString(test.copy(base, smaller)));
        System.out.println(Arrays.toString(test.copy(base, bigger)));
    }
}
