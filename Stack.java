import java.util.EmptyStackException;

public class Stack {

    private int[] array;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public Stack(int size) {
        this.capacity = size;
        this.array = new int[capacity];
        this.top = -1; // Stack is initially empty
    }

    // Push operation to add an element to the stack
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow: Cannot push element, stack is full.");
            return;
        }
        array[++top] = value;
        System.out.println(value + " pushed to stack");
    }

    // Pop operation to remove the top element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int poppedValue = array[top--];
        return poppedValue;
    }

    // Peek operation to return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Display all elements in the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the stack
        stack.display();

        // Peeking the top element
        System.out.println("Top element is: " + stack.peek());

        // Popping elements from the stack
        System.out.println(stack.pop() + " popped from stack");
        System.out.println(stack.pop() + " popped from stack");

        // Display the stack after popping
        stack.display();

        // Trying to pop from an empty stack
        System.out.println(stack.pop() + " popped from stack"); // This will throw EmptyStackException
    }
}
