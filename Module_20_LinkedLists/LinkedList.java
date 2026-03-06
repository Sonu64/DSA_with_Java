public class LinkedList {
    
    // Nested classes aren't that difficult :)
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Class level, needs objects to be made to access these. Non-static.
    public Node head; // may put static for both head and tail, but would be unable to create multiple lists then.
    public Node tail;
    
    private void addFirst(int data) {
        //Step-1: Create the new Node
        Node temp = new Node(data);
        //..If Linked List is empty..
        if(head == null) {
            head = tail = temp;
            return;
        }
        else {
            // Swap between head and the new first node made
            temp.next = head;
            head = temp;
        }
    }
    
    private void addLast(int data) {
        Node temp = new Node(data);
        // Linked List is empty 
        if (head == null) {
            head = tail = temp;
            return;
        }
        //Else
        else {
            tail.next = temp;
            tail = temp;
        }
    }

    private void printList() {
        Node curr = head;
        // checking curr != tail will make the loop exit even before printing the data part of tail !!!
        if(curr == null) {
            return;
        }
        if (curr==tail) {
            System.out.println(head.data);
            return;
        }
        // This is beautiful condition checking! Checking curr.next will not work, same for checking curr != tail..Just check when curr becomes null itself after moving to its "next" part.
        while (curr != null) {
            System.out.println(curr.data + "-->");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        LinkedList list1 = new LinkedList(); 
        
        // A new instance of LinkedList class, this is a LinkedList Object. Made inside the static main method.

        // A Static method (like main) is like a ghost—it has no "body" (object). Therefore, it cannot see "Instance" variables like head or tail directly because it doesn't know which house's door you're talking about. That's why we "have to" create our instance-variables -> Objects of the class.

        // By making main static, Java says: "I will let you run this code globally so you can 'spawn' the first objects into existence."

        list1.addFirst(90);
    }
}



// 🛠️ The "Aha!" Moment for your Notepad
// Can a method create its own class object?

// Static Methods: Yes (e.g., main starting the program).

// Instance Methods: Yes (e.g., a clone() method or a split() method).

// Constructors: Yes, but BE CAREFUL—if a constructor creates its own class object unconditionally, you get an infinite loop and a StackOverflowError.