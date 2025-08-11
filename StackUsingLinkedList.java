public class StackUsingLinkedList<T> {
    
    class Node {
        T data;
        Node next;
        Node(T val) {
            data = val;
            next = null;
        }
    }

    Node top;

    StackUsingLinkedList() {
        top = null;
    }

    public void push(T val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (top == null)
            throw new IndexOutOfBoundsException("Stack is Empty");

        T tmp = top.data;
        top = top.next;
        return tmp;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public T peek() {
        if (top == null)
            throw new IndexOutOfBoundsException("Stack is Empty");
        return top.data;
    }

    public static void main(String[] args) {
        StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element (peek): " + stack.peek()); 
       
        System.out.println("Popped: " + stack.pop()); 
        System.out.println("Popped: " + stack.pop()); 

        System.out.println("Top element after popping: " + stack.peek()); 

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); 

        stack.pop(); // removes 10
        System.out.println("Is stack empty after removing all? " + stack.isEmpty()); 
    }
}
