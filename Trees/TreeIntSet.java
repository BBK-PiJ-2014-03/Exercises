
public class TreeIntSet implements IntSet {
    
    private int value;
    
    private TreeIntSet left;
    private TreeIntSet right;
    
    public TreeIntSet (int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    
    
