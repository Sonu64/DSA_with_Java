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
        while(curr != null) {
            curr = curr.next;
            prev = curr;
            curr.next = prev;
            curr = curr.next;
        } /////////// WRONG !!!!!!!!!!!!
    }

    public static void main(String[] args) {

        LinkedList list1 = new LinkedList(); 
        

        // A new instance of LinkedList class, this is a LinkedList Object. Made inside the static main method.

        // A Static method (like main) is like a ghost—it has no "body" (object). Therefore, it cannot see "Instance" variables like this.head or this.tail directly because it doesn't know which house's door you're talking about. That's why we "have to" create our instance-variables -> Objects of the class.

        // By making main static, Java says: "I will let you run this code globally so you can 'spawn' the first objects into existence."

        list1.addFirst(90);
    }
}



// 🛠️ The "Aha!" Moment for your Notepad
// Can a method create its own class object?

// Static Methods: Yes (e.g., main starting the program).

// Instance Methods: Yes (e.g., a clone() method or a split() method).

// Constructors: Yes, but BE CAREFUL—if a constructor creates its own class object unconditionally, you get an infinite loop and a StackOverflowError.