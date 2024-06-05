class JavaDSA{
    private Node head;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Insert the node
    public void insert(int data){
        Node newNode = new Node(data); //new node creation

        if(head==null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Display the linked list
    public void display(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+"  ");
            current = current.next;
        }
    }

    public static void main(String [] args){
        JavaDSA obj = new JavaDSA();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.display();

    }
}