/**
 * JavaDSA
 */
public class JavaDSA {
    int size = 5;
    int items[] = new int [size];
    int front, rear;

    JavaDSA(){
        front = -1;
        rear = -1;
    }

    // check queue is full 
    boolean isFull(){
        if(front ==0 && rear==size-1){
            return true;
        }
        return false;
    }

    // check queue is empty
    boolean isEmpty(){
        if(front==-1){
            return true;
        }
        return false;
    }

    // Insert element in queue
    void enqueue(int item){
        if(isFull()){
            System.out.println("Queue is full - Overflow condition, Can't Insert " + item);
        }
        else{
            if(front==-1){
                front=0;
            }
            rear++;
            items[rear]=item;
            System.out.println("Inserted : "+item);
        }
    }

    // delete element from queue
    void dequeue(){
        int val ;
        if(isEmpty()){
            System.out.println("Queue is empty - Underflow conditin");
        }
        else{
            val= items[front];
            if(front>=rear){
                front=-1;
                rear=-1;
            }
            else{
                front++;
            }
            System.out.println("Deleted element is  "+ val);
        }
    }

    // Print queue
    void display(){
        int i;
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            for(i=front; i<=rear; i++){
                System.out.print(items[i]+ " ");
            }
        }
    }

    public static void main(String args []){
        JavaDSA q = new JavaDSA();
        q.dequeue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.dequeue();

        q.enqueue(40);
        q.enqueue(50);

        q.display();

        q.dequeue();
        q.display();

        q.dequeue();
        q.display();

        q.dequeue();
        q.display();

    }
}