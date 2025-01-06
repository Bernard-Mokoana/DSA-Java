/**
 * MyArrayList
 */
public class MyArrayList<E> {

    private int size;
    private E[] data;
    private int element;

    public MyArrayList() {
        data = (E[]) new Object[100];
        size = 0;
    }

    public void add(int index, E e) {
        if(index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index: " + index + "Size: " + size);

      for(int i = size - 1; i > index; i--) {
        data[i + 1] = data[i];
      }

      data[index] = e;
      size++;
    }

    public E remove(int index) {
        if(index < 0 || index > size - 1)
        throw new IndexOutOfBoundsException("Index: " + index + "Size: " + size);

       

        for(int i = index;  i < size - 1; i++){
            data[i] = data[i + 1];
        }

        E e = data[index];

        data[size - 1] = null;
        size--;
    return e;
    }

    public boolean contains(Object e) {
    
        for(int i = 0; i < size; i++)
          if(e.equals(data[i])) 
        return true;
          return false;
    }

    public E get(int index) {
        if(index < 0 || index >= size)
        throw new IndexOutOfBoundsException("Index: " + index + "Size: " + size);

        E e = data[index];
       return e;
    }

    public E set(int index, E e) {
        if(index < 0 || index > size - 1)
        throw new IndexOutOfBoundsException("Index: " + index + "Size: " + size);

        E hold = data[index];
        data[index] = e;

        return hold;
    }

    public boolean sortList() {
        E hold;
        for(int i = 0; i < size -1; i++)
         {
            for(int j = 0; j < size - 1; j++) 
            {
                if(((Comparable) 
                data[j]).compareTo(data[j + 1]) > 0) 
                {
                    hold = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = hold;
                }
            }
        }
        return true;
    }

    public int compareTo(MyArrayList other) {
        
        if(this.size > other.size) {
            return 1;
        } 
        else if(this.size < other.size) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        String result = "[";

        for(int i = 0; i < size; i++) {
            result += data[i];

            if(i < size - 1) {
                result += ", ";
            }
        }

        return result.toString() + "]";
    }

} 