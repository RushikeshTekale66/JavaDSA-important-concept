/**
 * stack
 */
// Built in stack class to perform stack operations
import java.util.Stack;

public class JavaDSA {
    public static void main(String args []){
        Stack <Integer> st = new Stack<>();

        // Insert element in stack
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Stack Elements are " + st);

        // Top element
        int topElement = st.peek();
        System.out.println(topElement);
        System.out.println("Stack Element after peek() "+ st);

        // Remove top element
        int popElement = st.pop();
        System.out.println("Removed element is "+ popElement);
        System.out.println("Stack after pop() "+st);

        // isEmpty
        System.out.println("Stack is empty " + st.isEmpty());


    }
}