/**
 * MyLinkedList
 */
public class MyLinkedList<E> {

  private Node<E> head, tail;

  public MyLinkedList() {
    head = null;
    tail = null;
  }

  private static class Node<E>{
    E element;
    Node<E> next;
    public Node(E element) {
      this.element = element;
      next = null;
    }
  }

  public void append(E e) {
    Node<E> newNode = new Node<>(e);

    if (head == null) {
      head = tail = newNode;
    }
    else{
      tail.next = newNode;
      tail = newNode; 
    }
  }

  public void prepend(E item) {
    Node<E> newNode = new Node<E>(item);

    newNode.next = head;
    head = newNode;

    if (tail == null) {
      tail = head;
    }
  }

  public boolean delete(E item) {
    Node<E> ptr = head;
    Node<E> prvPtr = null;
  }

  public String toString() {
    String result = "[";
    
    Node<E> ptr = head;

    for(ptr = head; ptr != null; ptr = ptr.next){
      result = result + ptr.element.toString();

      if(ptr.next != null)
        result = result + ",";
    }
    result += "]";
    return result;
  }
}