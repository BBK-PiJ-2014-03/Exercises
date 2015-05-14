public class Fibonacci {
    public static void main(String[] args) {
        
        System.out.println(recursiveFibonacci(6));
        System.out.println(iterativeFibonacci(6));
        
    }
    
    public static int recursiveFibonacci(int n) {
        if (n < 3) {
            return 1;
        }
        else {
            int result = recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
            return result;
        }
    }
    
    public static int iterativeFibonacci(int n) {
        int first = 1;
        int second = 1;
        int last = 1;
        
        if (n < 3) {
            return 1;
        }
        
        for (int count = 3; count <= n; count++) {
            last = first + second;
            first = second;
            second = last;
        }
        
        return last;
    }
}
