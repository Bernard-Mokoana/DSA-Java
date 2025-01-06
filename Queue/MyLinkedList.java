public class MyLinkedList<E> {

    private Node<E> head, tail;

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
            next = null;
        }
    }

    public E getFirst() {
        if(head == null) {
            return null;
        } else{
            return head.element;
        }
    }

    public E getLast() {
        if(tail == null) {
            return null;
        } else {
            return tail.element;
        }
    }

    public void append(E item){
        Node<E> newNode = new Node<>(item)
    }
    
}
