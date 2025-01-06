
public class QueueAsMyLinkedList<E> {
    MyLinkedList<E> theQueue;
    public QueueAsMyLinkedList()
    {
        theQueue = new MyLinkedList<>();
    }
    public void enqueue(E newElement)
    {
        theQueue.append(newElement);
    }
    public E dequeue()
    {
        E temp = null;
        boolean isDone = false;
        temp = theQueue.getFirst();
        if (temp != null)
        {
            isDone = theQueue.delete(temp);
        }
        if (isDone)
        {
            return temp;
        }else{
            return null;
        }
    }

    public E peek() {
        return theQueue.getFirst();
    }

    public boolean isEmpty() {
        return theQueue.getFirst() == null;
    }

    public int size() {
        return theQueue.size();
   }
    @Override
    public String toString()
    {
        return theQueue.toString();
    }
}