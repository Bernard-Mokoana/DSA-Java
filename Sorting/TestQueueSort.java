public class TestQueueSort {
    public static void main(String[] args) {
        QueueAsMyLinkedList<Integer> list1 = new QueueAsMyLinkedList<>();
        
        list1.enqueue(3);
        list1.enqueue(5);
        list1.enqueue(8);
        list1.enqueue(7);
        list1.enqueue(1);
        
        System.out.println("Unsorted Queue: " + list1);
   
        QueueAsMyLinkedList<Integer> sortedList = QueueSorter.method(list1, 5);
        
        System.out.println("Sorted Queue: " + sortedList);
    }
}
