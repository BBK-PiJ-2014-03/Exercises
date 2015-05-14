public class NumberQueue {
    
    private NumberDialed queueHead = null;
    private NumberDialed queueTail = null;
    
    public void insert(NumberDialed number) {
        if (queueHead == null) {
            queueHead = number;
            queueTail = number;
        }
        else {
            queueTail.prev = number;
            number.next = queueTail;
            queueTail = number;
        }
    }
    public NumberDialed retrieve() {
    
        if (queueTail != null && queueTail != queueHead) {
            NumberDialed result = queueHead;
            queueHead.prev.next = null;
            queueHead = result.prev;
            return result;
        }
        else
        {      
            if (queueTail != null && queueTail == queueHead) {
                NumberDialed result = queueHead;
                queueHead = null;
                queueTail = null;
                return result;
            }
            else
            {
                return null;
            }
        }
    }
    
    public void printNumbers() {
        NumberDialed temp = queueHead;
        while(temp != queueTail)
        {
            System.out.println(temp);
            temp = temp.prev;
        }
        System.out.println(queueTail);
    }
}
