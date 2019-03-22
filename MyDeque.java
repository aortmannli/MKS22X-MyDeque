public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  public MyDeque(){
    data = (E[])new Object[10];
  }

  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
  }

  public int size(){
    return int size;
  }

  public String toString(){
    String out = "{";
    int idx = start; //starts at start
    for (int i = 0; i < size; i++){ //loops through number of elements
      out += data[idx % data.length] + " "; //add element modded by data.length
      idx++;
    }
    return out + "}";
  }

  public void addFirst(E element){

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
