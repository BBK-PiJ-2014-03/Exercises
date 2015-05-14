public class ComparatorTest {
    
    public static void main(String[] args) {
        
        Comparator test = new Comparator();
        
        System.out.println(test.getMax(5, 10));
        
        double i = 5.0;
        double n = 50.0;
        
        System.out.println(test.getMax(i, n));
        
        String first = "100";
        String second = "200";
        System.out.println(test.getMax(first, second));
    }
}
