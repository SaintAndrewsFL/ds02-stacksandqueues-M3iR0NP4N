
public class QueueArray<E> {
    private E[] q;
    private int front, back, capacity, count;

    public QueueArray(int size) {
        this.capacity = size;
        this.q = (E[]) new Object[capacity];
        front = 0;
        back = -1;
        count = 0;
    }
    public void enqueue(E item) {
        if (count == capacity) throw new IllegalStateException("Queue is full");
        back = (back + 1) % capacity;
        q[back] = item;
        count++;
    }

    public E dequeue() {
        if (isEmpty())  throw new IllegalStateException("Queue is empty");
        E item = q[front];
        front = (front + 1) % capacity;
        count--;
        return item;
    }

    public E peek() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        return q[front];
    }

    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.print(q[(front + i) % capacity] + " ");
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
