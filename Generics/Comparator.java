public class Comparator {
    
    public int getMax(int n, int m) {
        if (n > m) {
            return n;
        }
        else {
            return m;
        }
    }
    
    public double getMax(double d1, double d2) {
        return getMax((int)d1, (int)d2);
    }
    
    public String getMax(String number1, String number2) {
        return Integer.toString(getMax(Integer.parseInt(number1), Integer.parseInt(number2)));
    }
}
