import java.util.LinkedList;

class JavaDSA {
    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<>();

        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);

        System.out.println("Linked list is " + obj);

        obj.addFirst(100);
        System.out.println("Linked List after adding first : " + obj);

        obj.addLast(200);
        System.out.println("Linked List after adding last : " + obj);

        obj.removeFirst();
        obj.removeLast();
        System.out.println("Linked list after removing first & last : " + obj);
    }
}