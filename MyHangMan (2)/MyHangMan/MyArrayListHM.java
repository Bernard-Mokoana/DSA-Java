import java.util.Arrays;

public class MyArrayListHM<E> 
{
  private int size; 
  private E[] data;
  private int MAXELEMENTS = 100;

  public MyArrayListHM() {
       data = (E[])new Object[MAXELEMENTS];
       size = 0; 
  }
  
  public boolean isFull()
  {
      if (size<MAXELEMENTS)
          return false;
      else
          return true;
  }
      
  public void add(int index, E e) {   
   
    if (index < 0 || index > size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size); 
    
    for (int i = size - 1; i >= index; i--)
     {  
      data[i + 1] = data[i];
     }
  
    data[index] = e;
    
    size++;
  }
  public boolean contains(Object e) {
    for (int i = 0; i < size; i++)
      if (e.equals(data[i])) return true;
    return false;
  }
  public E get(int index) {
    if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size);
    return data[index];
  }
  
  public E remove(int index) {
    if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size);
    E e = data[index];
   
    for (int j = index; j < size - 1; j++)
      data[j] = data[j + 1];
    data[size - 1] = null; 
 
    size--;
    return e;
  }
  
  public void clear()
  {
     size = 0;
  }
 
  public String toString() {
    String result="[";
    for (int i = 0; i < size; i++) 
    { 
      result+= data[i];
      if (i < size - 1) result+=", ";
    }
    return result.toString() + "]";
  }
  
  public int getSize() {
    return size;
  }
  
   public boolean sortList() {
    E hold;
	for (int i = 0; i < size-1; i++)
	 {
	   for (int j = 0; j<size-1; j++)
	    {  	 
	     if(((Comparable)data[j]).compareTo(data[j+1])>0)
	      {
	       hold= data[j+1];
	       data[j+1]=data[j];
	       data[j]=hold;
	      }       
	   }
     } 
	 return true;	  	
  }
  
 
}