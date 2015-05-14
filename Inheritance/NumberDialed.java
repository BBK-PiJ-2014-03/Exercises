public class NumberDialed {
    private String number;
    private int position;
    
    public NumberDialed next;
    public NumberDialed prev;
    
    public NumberDialed(String number, int position) {
        this.number = number;
        this.position = position;
        next = null;
        prev = null;
    }
    
    public void setPosition(int position) {
        this.position = position;
    }
    
    public NumberDialed getNext() {
        return next;
    }
    public NumberDialed getPrev() {
        return prev;
    }
    public int getPosition() {
        return position;
    }
    public String getNumber() {
        return number;
    }
    
    public String toString() {
        return "Number: " + number + "\nPosition: " + position;
    }
}
