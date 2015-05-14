public class Company {
    
    private ListNode<String> nameListStart = null;
    private ListNode<Integer> niNumberListStart = null;
    
    public static void main(String[] args) {
        Company newCompany = new Company();
        newCompany.launch();
    }
    
    public void launch() {
        ListNode<String> test = new ListNode<String>("Jim Smith");
        nameListStart = test;
        ListNode<String> second = new ListNode<String>("Sally Watkins");
        nameListStart.add(second);
        
        printList();
        printList();
    }
    
    public void printList() {
        ListNode<String> nameString = nameListStart;
        String result = "";
        while (nameString != null) {
            result += nameString.toString() + "\n";
            nameString = nameString.getNext();
        }
        System.out.println(result);
    }
}
