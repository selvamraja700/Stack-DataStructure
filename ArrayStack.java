public class ArrayStack<T> {
    static final int MAX_SIZE = 30;

    @SuppressWarnings("unchecked") // Removes the generic array warning
    T arr[] = (T[]) new Object[MAX_SIZE];
    int top;

    ArrayStack() {
        top = -1;
    }

    void push(T val) {
        if (top == MAX_SIZE - 1)
            throw new IndexOutOfBoundsException("Stack overflow");
        arr[++top] = val;
    }

    T pop() {
        if (top == -1)
            throw new IndexOutOfBoundsException("Stack underflow");
        return arr[top--];
    }

    T peek() {
        if (top == -1)
            throw new IndexOutOfBoundsException("Stack is empty");
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack(); 
        System.out.println("Top element (peek): " + stack.peek()); 

        System.out.println("Popped: " + stack.pop()); 
        stack.printStack(); // 20 10

        System.out.println("Is empty? " + stack.isEmpty()); 

        stack.pop();
        stack.pop();
        System.out.println("Is empty after all pops? " + stack.isEmpty()); 
    }
}
