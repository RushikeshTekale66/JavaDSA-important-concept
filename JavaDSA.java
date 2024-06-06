
// Doubly Linked list
class Node {
    int data ;
    Node prev;
    Node next;

    public Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class JavaDSA {

     Node head;
     public JavaDSA(){
        head = null;
     }

    //  Insert at begning
     public void insert(int data){
        Node newNode = new Node(data);

        if(head ==null){
            head = newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
     }

    //  Display list
    public void display(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            Node current = head;
            while (current!=null) {
                System.out.println(current.data + " ");
                current=current.next;
            }
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