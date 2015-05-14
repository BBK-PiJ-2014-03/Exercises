public class HanoiTowers {
    public static void main(String[] args) {
        
        for (int num = 1; num < 20; num++) {
            System.out.println(recursiveHanoi(num));
            System.out.println(iterativeHanoi(num));
        }
        
    }
    
    public static int recursiveHanoi(int n) {
        
        if (n == 1) {
            return 1;
        }
        else {
            int moves = 0;
            moves += (2*recursiveHanoi(n -1) +1);
            return moves;
        }
    }
    
    public static int recursiveHanoiCompact(int n) {    
        if (n == 1) {
            return 1;
        } else {
            return (2*recursiveHanoi(n -1) +1);
        }
    }
   
    
    public static int iterativeHanoi(int n) {
        int moves = 1;
        
        for (int count = 1; count < n; count++) {
            moves = (2*moves) +1;
        }
        return moves;
    }
        
}
