public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  public MyDeque(){
    data = (E[])new Object[10];
    size = 0;
    start = 0;
    end = 0;
  }

  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    size = 0;
    start = 0;
    end = 0;
  }

  public int size(){
    return int size;
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
  .
  public void addFirst(E element){
    if(size == data.length) resize;
    if(size != 0){
      if(start == 0) start = data.length - 1;
      else start--;
    }
    data[start] = element;
    size++;
  }

  public void addLast(E element){
    if(size == data.length) resize;
    if(size != 0){
      if(end == data.length) end = 0;
      else end++;
    }
    data[end] = element;
    size++;
  }

  public E removeFirst(){
    E og = data[start];
    if(size != 0){
      if(start = data.length - 1) start == 0;
      else start++;
    }
    size--;
    return og;
  }

  public E removeLast(){
    E og = data[end];
    if(size != 0){
      if(end == 0) end = data.length - 1;
      else end--;
    }
    size--;
    return og;
  }

  public E getFirst(){
    return data[start];
  }

  public E getLast(){
    return[end];
  }

}
