
public class QueueLL<E> {
    private Node<E> front, back;
    private int count;

    static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public QueueLL() {
        front = null;
        back = null;
        count = 0;
    }

    public void enqueue(E item) {
        Node<E> newNode = new Node<>(item);
        if (isEmpty()) front = newNode;
        else back.next = newNode;
        back = newNode;
        count++;
    }

    public E dequeue() {
        if (isEmpty()) return null;
        E item = front.data;
        front = front.next;
        count--;
        if (isEmpty()) back = null;
        return item;
    }

    public E peek() {
        if (isEmpty()) return null;
        return front.data;
    }

    public void display() {
        Node<E> current = front;
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
E enqueue(E item) - Pushes an item onto the bottom/back of this queue.
E dequeue() - Removes the object at the top of this queue and returns that object as the value of this function.
E peek()- Looks at the object at the top of this queue without removing it from the queue.
void display() - Outputs the queue order
int size() - Returns number of items in the queue
boolean isEmpty - Checks if queue is currently empty
 */