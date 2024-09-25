public class Main {
    public static void main(String[] args) {
        System.out.println("¯\\_(ツ)_/¯");
        QueueArray<Integer> queue = new QueueArray<>(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();

        System.out.println("Front item: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();

        System.out.println("Size: " + queue.size());
        System.out.println("Is empty: " + queue.isEmpty());
    }
}