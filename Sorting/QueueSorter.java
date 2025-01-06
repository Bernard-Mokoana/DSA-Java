public class QueueSorter {

    public static QueueAsMyLinkedList<Integer> method(QueueAsMyLinkedList<Integer> pl, int x) {
        if (x == 0) {  
            return pl;
        }

        int min = findMin(pl, x);

        QueueAsMyLinkedList<Integer> sortedQueue = new QueueAsMyLinkedList<>();
        sortedQueue.enqueue(min); 


        QueueAsMyLinkedList<Integer> tempQueue = removeElement(pl, min);

       
        QueueAsMyLinkedList<Integer> recursivelySortedQueue = method(tempQueue, x - 1);

        while (recursivelySortedQueue != null && recursivelySortedQueue.theQueue.size() > 0) {
            sortedQueue.enqueue(recursivelySortedQueue.dequeue());
        }

        return sortedQueue;
    }

    private static int findMin(QueueAsMyLinkedList<Integer> queue, int size) {
        QueueAsMyLinkedList<Integer> tempQueue = new QueueAsMyLinkedList<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            int element = queue.dequeue();
            if (element < min) {
                min = element;
            }
            tempQueue.enqueue(element);  
        }

        while (tempQueue.theQueue.size() > 0) {
            queue.enqueue(tempQueue.dequeue());
        }

        return min;
    }

    private static QueueAsMyLinkedList<Integer> removeElement(QueueAsMyLinkedList<Integer> queue, int element) {
        QueueAsMyLinkedList<Integer> tempQueue = new QueueAsMyLinkedList<>();
        boolean removed = false;

        while (queue.theQueue.size() > 0) {
            int currElement = queue.dequeue();
            if (currElement != element || removed) {
                tempQueue.enqueue(currElement); 
            } else {
                removed = true;  
            }
        }

        return tempQueue;
    }
}
