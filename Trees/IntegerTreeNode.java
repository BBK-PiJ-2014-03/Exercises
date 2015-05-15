public class IntegerTreeNode {
    
    private int value;
    
    private IntegerTreeNode left;
    private IntegerTreeNode right;

    public IntegerTreeNode (int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    
    // Adds an new node to the Tree structure
    public void add(int newNumber) {
        if (newNumber > this.value) {
            if (right == null) {
                right = new IntegerTreeNode(newNumber);
            }
            else {
                right.add(newNumber);
            }
        }
        else {
            if (left == null) {
                left = new IntegerTreeNode(newNumber);
            }
            else {
                left.add(newNumber);
            }
        }
    }
    
    // goes through the list testing if the parameter value int 'n' is contained in the current node
    // then checks if the value is greater than the current value
    // in which case the method tests the right node.
    public boolean contains(int n) {
        if (n == this.value) {
            return true;
        }
        else if (n > this.value) {
            if (right == null) {
                return false;
            }
            else {
                return right.contains(n);
            }
        }
        else {
            if (left == null) {
                return false;
            }
            else {
                return left.contains(n);
            }
        }
    }
    
    // getMax() method
    // checks whether the current object has a right branch
    // if it doesn't, the current object has the highest value
    // else, it calls getMax() on the right node.
    public int getMax() {
        if (this.right == null) {
            return this.getValue();
        }
        else {
            return this.right.getMax();
        }
    }
    
    // getMin() method
    // checks whether the current object has a left branch
    // if it doesn't, the current object has the lowest value
    // else, it calls getMin() on the left node.
    public int getMin() {
        if (this.left == null) {
            return this.getValue();
        }
        else {
            return this.left.getMin();
        }
    }
    
    
    // 1. 
    // closing brackets
    // 2. 
    // public X myMethod() {
    //    X result = ...;
    //    ...
    //    return result;
    //  }
    
    public String toString() {
        String treeDisplay = "[" + this.getValue();
        
        if (this.left == null) {
            treeDisplay += " L[]";
        }
        if (this.left != null) {
            treeDisplay += " L[" + this.left.toString() + "]";
        }
        if (this.right == null) {
            treeDisplay += " R[]";
        }
        if (this.right != null) {
            treeDisplay += " R[" + this.right.toString() + "]";
        }
        if (this.left == null && this.right == null) {
            treeDisplay += "]";
        }
        return treeDisplay;
    }
    
    public int getDepth() {
        if (this.left == null && this.right == null) {
            return 1;
        }
        else {
            int leftDepth = 0;
            int rightDepth = 0;
            if (this.left != null && this.right == null) {
                leftDepth = this.left.getDepth() + 1;
            }
            if (this.left == null && this.right != null) {
                rightDepth = this.right.getDepth() + 1;
            }
            if (this.left != null && this.right != null) {
                leftDepth = this.left.getDepth() + 1;
                rightDepth = this.right.getDepth() + 1;
            }
            if (leftDepth > rightDepth) {
                return leftDepth;
            }
            else {
                return rightDepth;
            }
        }
    }
    
    
    public int getValue() {
        return value;
    }
}
