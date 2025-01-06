public class MyLinkedList<E>  {
    private Node<E> head, tail;
    private int size;
   
    public MyLinkedList() {
       head = null;
       tail = null;
       size = 0;
    }

    public E getFirst() {
      if (head == null) {
        return null;
      }
      else {
        return head.element;
      }
    }
  
    public E getLast() {
      if (head==null) {
        return null;
      }
      else {
        return tail.element;
      }
    }
  
 
    public void prepend(E e) {
      Node<E> newNode = new Node<>(e); 
      newNode.next = head; 
      head = newNode; 
     
      if (tail == null) 
        tail = head;
        size++;
    }
  
    
    public void append(E item) {
      
      Node<E> newNode = new Node<>(item);
  
      if (head == null) {
        head = tail = newNode; 
      }
      else {
        tail.next = newNode; 
        tail = newNode; 
      }
      size++;
    }

  public boolean delete(E item)
     {
         Node<E> ptr = head;
         Node<E> prvPtr = null;
         while (ptr!= null&& ((Comparable)ptr.element).compareTo(item)!= 0)
         {
             prvPtr=ptr;
             ptr=ptr.next;
         }
         if (ptr == null)
             return false;
         if (ptr==head) 
             head= head.next;
         else 
             prvPtr.next=ptr.next;
         if (ptr==tail)
             tail=prvPtr;
             size--;
         return true;
     }

     public int size() {
      return size;
     }
   
    public String toString() {
      String result = "[";
  
      Node<E> ptr = head;
      for (ptr= head;ptr!=null; ptr=ptr.next) 
      {
           result = result +  ptr.element.toString();     
           if (ptr.next != null)
               result = result + ","; 
      }
      result += "]"; 
      return result;
    }
  
  
    public void clear() {
       head = tail = null;
    }
  
  
    private static class Node<E> {
      E element;
      Node<E> next;
  
      public Node(E element) {
        this.element = element;
        next = null;
      }
    }
     
  }
  