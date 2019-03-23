import java.util.*;

public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

   @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    size = 0;
    start = 0;
    end = 0;
  }

  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    size = 0;
    start = 0;
    end = 0;
  }

  public int size(){
    return size;
  }

  public String toString(){
    String out = "{";
    int idx = start;
    for (int i = 0; i < size; i++){
      out += data[idx % data.length] + " ";
      idx++;
    }
    return out + "}";
  }

  @SuppressWarnings("unchecked")
  private void resize(){
    E[] hold = (E[]) new Object[size() * 2 + 1];
    int idx = start;
    for (int i = 0; i < size; i++){
      hold[i] = data[idx % data.length];
      idx++;
    }
    data = hold;
    start = 0;
    end = size - 1;
  }

  public void addFirst(E element){
    if (element == null) throw new NullPointerException("Nsull");

    if(size == data.length) resize();
    if(size != 0){
      if(start == 0) start = data.length - 1;
      else start--;
    }
    data[start] = element;
    size++;
  }

  public void addLast(E element){
    if (element == null) throw new NullPointerException("Cannot add null");

    if(size == data.length) resize();
    if(size != 0){
      if(end == data.length) end = 0;
      else end++;
    }
    data[end] = element;
    size++;
  }

  public E removeFirst(){
    if (size() == 0) throw new NoSuchElementException("This Deque is empty");

    E og = data[start];
    data[start] = null;
    if(size != 1){
      if(start == data.length - 1) start = 0;
      else start++;
    }
    size--;
    return og;
  }

  public E removeLast(){
    if (size() == 0) throw new NoSuchElementException("This Deque is empty");

    E og = data[end];
    data[end] = null;
    if(size != 1){
      if(end == 0) end = data.length - 1;
      else end--;
    }
    size--;
    return og;
  }

  public E getFirst(){
    if (size() == 0) throw new NoSuchElementException("This Deque is empty");
    return data[start];
  }

  public E getLast(){
    if (size() == 0) throw new NoSuchElementException("This Deque is empty");
    return data[end];
  }

}
