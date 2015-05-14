import java.util.ArrayList;
import java.util.List;

public class HailstoneNumbers {
    
    private ArrayList<Integer> hailstoneList = new ArrayList<Integer>();
    
    public static void main(String[] args) {
        
        HailstoneNumbers test = new HailstoneNumbers();
        
        test.getNumbers(100);
        
        System.out.println(test.getList());
    }
    
    public int getNumbers(int n) {
        hailstoneList.add(n);
        if (n <= 1) {
            return n;
        }
        if (n % 2 == 0) {
            return getNumbers(n/2);
        }
        else {
            return getNumbers((n*3) + 1);
        }
    }
    
    public ArrayList<Integer> getList() {
        return hailstoneList;
    }
}
