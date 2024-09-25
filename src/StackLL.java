public class StackLL<E> {
    private Node<E> top;
    private int count;

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public StackLL() {
        top = null;
        count = 0;
    }

    public void push(E item) {
        Node<E> newNode = new Node<>(item);
        newNode.next = top;
        top = newNode;
        count++;
    }

    public E pop() {
        if (isEmpty()) throw new IllegalStateException("Stack is empty");
        E item = top.data;
        top = top.next;
        count--;
        return item;
    }

    public E peek() {
        if (isEmpty()) throw new IllegalStateException("Stack is empty");
        return top.data;
    }

    public void display() {
        Node<E> current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
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