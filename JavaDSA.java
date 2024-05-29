class JavaDSA{
    private int maxSize;
    private int top;
    private int[] stackArray;

    public JavaDSA(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top=-1;
    }
    
    // Insert element in stack
    public void push(int value){
        if(top==maxSize-1){
            System.out.println("Stack is full, you can not push element " + value);
        }
        else{
            top++;
            stackArray[top]=value;
            System.out.println("Pushed element is " + value);
        }
    }

    // remove element in stack
    public void pop(){
        if(top==-1){
            System.out.println("Stack is empty we can't pop element");
        }
        else{
            int value = stackArray[top];
            top--;
            System.out.println("Poped element is " + value);
            // return value;
        }
    }

    // Display the top element of stack
    public int peek(){
        if(top==-1){
            System.out.println("Stack is empty cannot peek element");
            return -1;
        }
        else return stackArray[top];
    }

    // Check stack is empty
    public boolean isEmpty(){
        return (top==-1);
    }

    // Check stack is full
    public boolean isFull(){
        return (top==maxSize-1);
    }

    public void display(){
        for(int i=top; i>=0; i--){
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        JavaDSA obj = new JavaDSA(5);
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(60);

        obj.display();
        obj.pop();
        obj.display();

        System.out.println("Top element is " + obj.peek());
        System.out.println("Is stack empty " + obj.isEmpty());
        System.out.println("Is stack full " + obj.isFull());
    }
}