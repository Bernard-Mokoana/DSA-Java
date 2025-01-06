public class MyLinkedList<E> {

    private Node<E>  head, tail;



    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
            next = null;
        }
    }

    
    public E getFirst() {
        if(head == null){
            return null;
        } else {
            return head.element;
        }
    }

    public void prepend(E item){
        Node<E> newNode = new Node<E>(item);

        newNode.next = head;
        head = newNode;

        if(tail == null) {
            tail = head;
        }
    }
    
    public boolean delete(E item) {

        Node<E> ptr = head;
        Node<E> prevPtr = null;

        while(ptr != null && ((Comparable)ptr.element).compareTo(item) != 0) {
            
            prevPtr = ptr;
            ptr = ptr.next;
        }
        
        if(ptr == null) {
            return false;
        }
        if(ptr == head){
            head = head.next;
        }
        else {
            prevPtr.next = ptr.next;
        }
        if(ptr == tail) {
            tail = prevPtr;
    return true;
        }
        return false;
    }

    public String toString() {
        String results = "[";

        Node<E> ptr = head;
        for(ptr = head; ptr != null; ptr = ptr.next){
            results = results + ptr.element.toString();
            if(ptr.next != null)
            results = results + ",";
        }
        results += "]";
        return results;
    }
}
