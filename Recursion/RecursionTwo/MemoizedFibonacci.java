public class MemoizedFibonacci {

    public static int recursiveFibonacci(int n) {
        if (n < 3) {
            return 1;
        }
        else {
            int result = recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
            return result;
        }
    }
    
    public static int memoizedFibonacci (int n) {
        int[] precalculated = new int[n];
        
        for (int i = 0; i < precalculated.length; i++) {
            precalculated[i] = -1;
        }
        
        if ((n == 1) || (n == 2)) {
            return 1;
        }
        else {
            if (precalculated[n-1] != -1) {
                return precalculated[n-1];
            }
            else {
                int result = memoizedFibonacci(n-1) + memoizedFibonacci(n-2);
                precalculated[n-1] = result;
                return result;
            }
        }
    }
}
