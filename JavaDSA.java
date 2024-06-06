import java.util.LinkedList;
import java.util.ListIterator;

class JavaDSA {
    public static void main(String[] args) {
        LinkedList <Integer> obj = new LinkedList<>();

        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);

        ListIterator <Integer> iterator = obj.listIterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        obj.addFirst(obj.removeLast());
        iterator = obj.listIterator();

        for(int i=0; i<obj.size(); i++){
            System.out.print(iterator.next() + " ");
        }
    }
}