public class LinkedList {
    
    // Nested-Static Class.
    // See image for details.
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }



    // Class level, needs objects to be made to access these. Non-static.
    private Node head; // may put static for both this.head and this.tail, but would be unable to create multiple lists then.
    private Node tail;

    private int size = 0;
    
    public void addFirst(int data) {
        //Step-1: Create the new Node
        Node temp = new Node(data);
        size++;
        //..If Linked List is empty..
        if(this.head == null) {
            this.head = this.tail = temp;
            return;
        }
        else {
            // Swap between this.head and the new first node made
            temp.next = this.head;
            this.head = temp;
        }
    }
    
    public void addLast(int data) {
        Node temp = new Node(data);
        size++;
        // Linked List is empty 
        if (this.head == null) {
            this.head = this.tail = temp;
            return;
        }
        //Else
        else {
            this.tail.next = temp;
            this.tail = temp;
        }
    }

    public void printList() {
        Node curr = this.head;
        // This is beautiful condition checking! Checking curr.next will not work, same for checking curr != this.tail..Just check when curr becomes null itself after moving to its "next" part.
        while (curr != null) {
            System.out.println(curr.data + "-->");
            curr = curr.next;
        }
    }

    public int getSize() {
        return size;
    }

    public void addAtIndex(int index, int data) {
        Node temp = new Node(data);
        int count = 0;
        Node curr = this.head;

        if(index==0) {
            addFirst(data);
            return;

        }

        // getSize()-1 will add @ one index before last index.
        // getSize() is the one that pushes, old size = 3, newsize = 4, which is the getSize(), not getSize()-1 !
        if(index==getSize()){
            addLast(data);
            return;
        }

        while(count < index-1) {
            // if we need to insert @ index m, then we must stop @ index m-1, in 0-based indexing !!!important!!!
            curr = curr.next;
            count++;
        }
        temp.next = curr.next;
        curr.next = temp;
        size++;
    }

    public void removeFirst() {
        // If no element present
        if(getSize()==0) {
            System.out.println("Empty Linked List !");
            return;
        }
        // If only one element present
        if(getSize()==1) {
            head = tail = null;
            size--;
            return;
        }
        this.head = this.head.next; 
        size--;
        return;
    }

    public void removeLast() {
        //Empty List
        if(getSize()==0) {
            System.out.println("LinkedList is Empty !");
            return;
        }
        // Single Element
        if(getSize()==1) {
            this.head = this.tail = null;
            size--;
            return;
        }
        //Normal Chain
        Node prev = this.head;
        while(prev.next.next != null) {
            prev = prev.next;
        }
        // 2nd Last Node found !
        //...cutting link to tail
        prev.next = null;
        //...rejoining tail
        tail = prev;
        size--;
        return;
        // 1st Last: The Tail itself (Index: size - 1).
        // 2nd Last: The Node before the Tail (Index: size - 2).
    }

    public int iterativeSearch(int target) {
        int count = 0;
        Node temp = this.head;
        while(temp != null) {
            if(temp.data==target) {
                return count; // count++ must be below this, 
                // try imagining the scenario of single element,
                // where we must return 0, not 1.
            }
            count++;
            temp = temp.next;
        }
        return -1;//no valid count found !            
    }

    public void reverseList() {
        Node prev = null;
        Node curr = this.head;
        Node restOfList;
        // Reverse the direction of Arrows ---> to <----
        while(curr != null) {
            // Saved rest of List
            restOfList = curr.next;
            // Cutting forward Link
            curr.next = prev;
            // Make prev look backwards, where curr actually was
            prev = curr;
            // Access the rest of the list using the next variable
            curr = restOfList;
        } 
        // Swap head and tail pointers
        this.tail = this.head;
        // prev is already standing on the new head, the last non-null node !
        this.head = prev;
        // Above approach is safer than to manually use a seperate 
        // temp variable similar to swapping 2 variables. Because here
        // even if tail isn't updated properly in any other function,
        // prev will always land on the last non-null node.
    }


    public boolean isPalindrome() {
        LinkedList copy = new LinkedList();
        Node curr = this.head;
        while(curr != null) {
            copy.addLast(curr.data);
            curr = curr.next;
        }
        copy.reverseList();
        // Now time to compare node-wise
        Node curr1 = this.head;
        Node curr2 = copy.head;

        while(curr1 != null && curr2 != null) {
            if(curr1.data != curr2.data)
                return false;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return true;
    }

    public boolean quickIsPalindrome() {
        // !! Important ! In-Place Palindrome checker
        int midPosition = (int)Math.floor(getSize()/2);
        Node endPointer = this.tail;
        Node curr = this.head;
        int nodePosition = 0;
        Node nodeBeforeMid = null;

        while(nodePosition != midPosition) { 
            curr = curr.next;
            nodePosition++;
            if (nodePosition == midPosition-1)  {
                nodeBeforeMid = curr;
            }
        } // ! O(n)

        // ! curr now stands at midPosition
        Node midPointer = curr; // !! endPointer @ end, midPointer @ mid
        // Now List is like 1--> 1--> 2 -->1 -->1 have to make it like 1--> 1--> 2 <--1 <--1
        // We have to reverse the pointers of the 2nd half.
        Node prev = null;
        Node current = midPointer;
        Node restOfList = null;


        while(current != null) {
            // Saved rest of List
            restOfList = current.next;
            // Cutting forward Link
            current.next = prev;
            // Make prev look backwards, where curr actually was
            prev = current;
            // Access the rest of the list using the next variable
            current = restOfList;
        }

        Node curr1 = this.head;
        Node curr2 = prev;

        while (curr2 != midPointer) {
            if (curr1.data != curr2.data)
                return false;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        

        // Fix List back
        Node restorationCurr = prev; // 'prev' was the head of the reversed half
        Node restorationPrev = null;

        while (restorationCurr != midPointer) {
            Node nextTemp = restorationCurr.next;
            restorationCurr.next = restorationPrev;
            restorationPrev = restorationCurr;
            restorationCurr = nextTemp;
        }

        // THE MISSING LINK:
        if (nodeBeforeMid != null) {
            nodeBeforeMid.next = midPointer; 
        }
        midPointer.next = restorationPrev; // Reconnects the middle to the restored tail

        return true;
    }

    public void findAndRemoveNthNodeFromEnd(int n) {
        // !! Asked in Amazon, Flipkart and multiple other SWE coding interviews.
        // Wannna delete the head, size-th node from End
        if (n == getSize()) {
            this.head = this.head.next;
        }
        else {
            int positionFromBeginning = getSize()-n; // doing -1 will land up at the Node to delete, we wanna land at the previous Node actually...Read Loop condition comment on how this is achieved !
            int count = 0;
            Node prev = this.head;
            while (count < positionFromBeginning-1) {
                // Since we are starting @ 0, not 1, we need the -1 at the loop condition to stop at the previous Loop !
                count++;
                prev = prev.next;
            }
            prev.next = prev.next.next;
        }
    }


    public static void main(String[] args) {

        LinkedList list1 = new LinkedList(); 
        

        // A new instance of LinkedList class, this is a LinkedList Object. Made inside the static main method.

        // A Static method (like main) is like a ghost—it has no "body" (object). Therefore, it cannot see "Instance" variables like this.head or this.tail directly because it doesn't know which house's door you're talking about. That's why we "have to" create our instance-variables -> Objects of the class.

        // By making main static, Java says: "I will let you run this code globally so you can 'spawn' the first objects into existence."

        list1.addLast(10);
        list1.addLast(10);
        list1.addLast(20);
        list1.addLast(10);
        list1.addLast(10);
        System.out.println(list1.isPalindrome());
        System.out.println(list1.quickIsPalindrome());
    }
}



// 🛠️ The "Aha!" Moment for your Notepad
// Can a method create its own class object?

// Static Methods: Yes (e.g., main starting the program).

// Instance Methods: Yes (e.g., a clone() method or a split() method).

// Constructors: Yes, but BE CAREFUL—if a constructor creates its own class object unconditionally, you get an infinite loop and a StackOverflowError.