public class Power {
    public static void main(String[] args) {
        
        System.out.println(iterativePower(2,10));
        System.out.println(recursivePower(2,10));
    
    }
    
    public static int recursivePower(int n, int i) {
        if (i == 1) {
            return n;
        }
        else {
            return n *recursivePower(n, i-1);
        }
    }
   
    
    
    public static int iterativePower(int n, int i) {
        int result = 1;
        for (int count = 1; count <= i; count++) {
            result *= n;
        }
        return result;
    }
}
