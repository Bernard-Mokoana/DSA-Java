public class MyLinkedList<E extends Comparable<E>> {
    private Node<E> head, tail;
  
    public MyLinkedList() {
       head = null;
       tail = null;
    }
  
    /** Return the head element in the list */
    public E getFirst() {
      return (head == null) ? null : head.element;
    }
  
    /** Return the last element in the list */
    public E getLast() {
      return (tail == null) ? null : tail.element;
    }
  
    /** Add an element to the beginning of the list */
    public void prepend(E e) {
      Node<E> newNode = new Node<>(e);
      newNode.next = head;
      head = newNode;
  
      if (tail == null) 
        tail = head;
    }
  
    /** Add an element to the end of the list */
    public void append(E item) {
      Node<E> newNode = new Node<>(item);
  
      if (head == null) {
        head = tail = newNode;
      } else {
        tail.next = newNode;
        tail = newNode;
      }
    }
  
    /** Remove the head node and return the object that is contained in the removed node. */
    public E removeFirst() {
      if (head == null) {
        return null;
      }
      E temp = head.element;
      head = head.next;
      if (head == null) {
        tail = null;
      }
      return temp;
    }
  
    /** Delete a specific item from the list */
    public boolean delete(E item) {
      Node<E> ptr = head;
      Node<E> prvPtr = null;
  
      while (ptr != null && ptr.element.compareTo(item) != 0) {
        prvPtr = ptr;
        ptr = ptr.next;
      }
  
      if (ptr == null) {
        return false;
      }
  
      if (ptr == head) {
        head = head.next;
      } else {
        prvPtr.next = ptr.next;
      }
  
      if (ptr == tail) {
        tail = prvPtr;
      }
  
      return true;
    }
  
    /** Multiply each element in the list by 5 and return a new list */
    public MyLinkedList<Integer> Multiply() {
      MyLinkedList<Integer> result = new MyLinkedList<>();
      TimesFive(head, result);
      return result;
    }
  
    /** Recursive method to multiply elements by 5 */
    private void TimesFive(Node<E> node, MyLinkedList<Integer> result) {
      if (node != null) {
        result.append((Integer)node.element * 5);  // Cast to Integer, assuming E is Integer for this use case
        TimesFive(node.next, result);
      }
    }
  
    /** Return a string representation of the list */
    public String toString() {
      StringBuilder result = new StringBuilder("[");
  
      for (Node<E> ptr = head; ptr != null; ptr = ptr.next) {
        result.append(ptr.element);
        if (ptr.next != null) {
          result.append(",");
        }
      }
  
      result.append("]");
      return result.toString();
    }
  
    /** Clear the list */
    public void clear() {
      head = tail = null;
    }
  
    private static class Node<E> {
      E element;
      Node<E> next;
  
      public Node(E element) {
        this.element = element;
        this.next = null;
      }
    }
  }
  