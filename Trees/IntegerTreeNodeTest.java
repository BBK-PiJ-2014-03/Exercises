public class IntegerTreeNodeTest {
    public static void main(String[] args) {
        
        IntegerTreeNode treeRoot = new IntegerTreeNode(6);
        
        treeRoot.add(9);
        treeRoot.add(5);
        treeRoot.add(3);
        
        treeRoot.add(8);
        treeRoot.add(11);
        treeRoot.add(12);
        
        
        /* System.out.println(treeRoot.getMin());
        System.out.println(treeRoot.getMax()); */
        
        System.out.print(treeRoot);
        
        /* System.out.println(treeRoot.getDepth()); */
    }
}
