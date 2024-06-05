import javax.management.RuntimeErrorException;

class JavaDSA {
    private Node head;

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // 1) Insertion Operations
    // Insert the node at bigining
    public void insertAtBigning(int data) {
        Node newNode = new Node(data); // new node creation
        newNode.next = head;
        head = newNode;
        System.out.println("Inserted at begening " + data);
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Inserted at end " + data);
    }

    // Insert at middle
    public void insertAtIndex(int index, int data) {

        // Throw error if index is less than zero or index is greater then the size of
        // linkedlist
        if (index < 0 || index > getSize()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        // Insert index at begining
        if (index == 0) {
            insertAtBigning(data);
        }
        // Insert at end
        else if (index == getSize()) {
            insertAtEnd(data);
        }
        // Insert at given index
        else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        System.out.println("Inserted at index " + index + " : "+ data);
    }

    // 2) Deletion Operation
    // Delete at begining
    public void deleteAtBegining() {
        if (head == null) {
            throw new RuntimeException("Linked list is empty");
        }
        head = head.next;
    }

    // Delete at end
    public void deleteAtEnd() {
        // If Linked list is empty
        if (head == null) {
            throw new RuntimeException("Linked list is empty");
        }
        // If liked list have only 1 element
        else if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        System.out.println("Deleted at end");
    }

    // Delete at perticular index
    public void deleteAtIndex(int index) {
        // Throw error if index is less than zero or index is greater then the size of
        // linkedlist
        if (index < 0 || index > getSize()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        // delete at begining
        if(index==0){
            deleteAtBegining();
        }
        // delete at end
        else if (index==getSize()){
            deleteAtEnd();
        }
        else {
            Node current = head;
            for(int i=0; i<index-1; i++){
                current = current.next;
            }
            current.next = current.next.next;
        }
        System.out.println("Deleted at index "+index);

    }

    // getting the size of the linked list
    public int getSize(){
        int count =0; 
        Node current = head;
        while(current !=null){
            count++;
            current = current.next;
        }
        return count;
    }

    // check the linked list is empty or not
    public void isEmpty(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            System.out.println("List have some element");
        }
        
    }

    // Display the linked list
    public void display() {
        Node current = head;
        if(head==null) isEmpty();
        while (current != null) {
            System.out.print(current.data + "  ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        JavaDSA obj = new JavaDSA();

        obj.display();

        obj.insertAtBigning(10);
        obj.insertAtBigning(20);
        obj.insertAtBigning(30);
        obj.insertAtBigning(40);

        obj.display();

        obj.insertAtEnd(100);
        obj.display();

        obj.insertAtIndex(2, 200);
        obj.display();

        obj.deleteAtBegining();
        obj.display();

        obj.deleteAtEnd();
        obj.display();

        obj.deleteAtIndex(2);

    }
}