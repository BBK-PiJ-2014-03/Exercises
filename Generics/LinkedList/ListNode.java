public class ListNode<T>  {
    
    private ListNode<T> next;
    private ListNode<T> prev;
    
    private T element;
    
    public ListNode(T element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }
        
        
    
    public void add(ListNode<T> newElement) {
        if (this.next == null) {
            this.next = newElement;
        }
        else {
            this.next.add(newElement);
        }
    }
    
    public boolean remove(ListNode<T> newElement) {
        if (this.next == null) {
            return false;
        }
        else if (this.next.element.equals(newElement.element)) {
            this.next = this.next.next;
            this.next.getNext().getNext().prev = this;
            this.next.next = null;
            this.next.prev = null;
            return true;
        }
        else {
            return this.next.remove(newElement);
        }
    }
    
    public ListNode<T> get(ListNode<T> newElement) {
        ListNode<T> result;
        if (this.next == null) {
            result = null;
            return result;
        }
        else if (this.next.element.equals(newElement.element)) {
            result = this.next;
            return result;
        }
        else {
            return this.next.get(newElement);
        }
    }
    
    public ListNode<T> getNext() {
        return next;
    }
    public ListNode<T> getPrev() {
        return prev;
    }
    public String toString() {
        return (String) element;
    }
    
}
        
        
