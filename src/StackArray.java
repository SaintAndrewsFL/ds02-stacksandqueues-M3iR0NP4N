

public class StackArray<E> {
    private E[] stack;
    private int top, capacity;

    public StackArray(int size) {
        this.capacity = size;
        stack = (E[]) new Object[capacity];
        top = -1;
    }

    public void push(E item) {
        if (top == capacity - 1) return;
        stack[++top] = item;
    }

    public E pop() {
        if (isEmpty()) return null;
        return stack[top--];
    }

    public E peek() {
        if (isEmpty()) return null;
        return stack[top];
    }

    public void display() {
        for (int i = top; i >= 0; i--) System.out.print(stack[i] + " ");
        System.out.println();
    }

    public int size() {
        return top + 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
}


/*
E push(E item) - Pushes an item onto the top of this stack.
E pop() - Removes the object at the top of this stack and returns that object as the value of this function.
E peek()- Looks at the object at the top of this stack without removing it from the stack.
void display() - Outputs the stack order
int size() - Returns number of items in the stack
boolean isEmpty - Checks if stack is currently empty
 */