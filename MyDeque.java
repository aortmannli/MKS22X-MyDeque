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
      if(start == 0) start = data.length - 0;
      else start--;
    }
    data[start] = element;
    size++;
  }

  public void addLast(E element){

  }

  public E removeFirst(){

  }

  public E removeLast(){

  }

  public E getFirst(){

  }

  public E getLast(){

  }

}
