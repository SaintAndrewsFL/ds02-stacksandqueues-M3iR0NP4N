public class Main {
    public static void main(String[] args) {
        System.out.println("¯\\_(ツ)_/¯");
        QueueArray<Integer> queue = new QueueArray<>(5);
        QueueLL<Integer> myQueueLL = new QueueLL<>();
        StackArray<Integer> stackArray = new StackArray<>(5);
        StackLL<Integer> stackLL = new StackLL<>();

       for(int i = 0; i < 5; i++) {
           stackLL.push(i);
       }

       System.out.println();
       stackLL.display();

        /*
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();

        System.out.println("Front item: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();

        System.out.println("Size: " + queue.size());
        System.out.println("Is empty: " + queue.isEmpty());

        System.out.println("¯\\_(ツ)_/¯");
        QueueLL<Integer> queueue = new QueueLL<>();

        queueue.enqueue(1);
        queueue.enqueue(2);
        queueue.enqueue(3);
        queueue.display();

        System.out.println("Front item: " + queueue.peek());
        System.out.println("Dequeued: " + queueue.dequeue());
        queueue.display();

        System.out.println("Size: " + queueue.size());
        System.out.println("Is empty: " + queueue.isEmpty());

        System.out.println("¯\\_(ツ)_/¯");
        StackArray<Integer> stack = new StackArray<>(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.display();

        System.out.println("Top item: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        stack.display();

        System.out.println("Size: " + stack.size());
        System.out.println("Is empty: " + stack.isEmpty());

        System.out.println("¯\\_(ツ)_/¯");
        StackLL<Integer> stackack = new StackLL<>();

        stackack.push(1);
        stackack.push(2);
        stackack.push(3);
        stackack.push(4);
        stackack.display();

        System.out.println("Top item: " + stackack.peek());
        System.out.println("Popped: " + stackack.pop());
        stackack.display();

        System.out.println("Size: " + stackack.size());
        System.out.println("Is empty: " + stackack.isEmpty());

         */
    }
}