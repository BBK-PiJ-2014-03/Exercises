public class DoubleLinkedListContainer<T> {

    private ListNode<T> headElement = null;
    
    public void addElement(ListNode<T> newElement) {
        headElement.add(newElement);
    }
    
    public void removeElement(ListNode<T> newElement) {
        headElement.remove(newElement);
    }
    
    public void getNode(ListNode<T> newElement) {
        headElement.get(newElement);
    }
}
