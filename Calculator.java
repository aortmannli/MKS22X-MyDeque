import java.lang.*;
import java.io.*;
import java.util.*;

public class Calculator{

  public static void main(String[] args) {
    System.out.println(eval("9 9 +")); //18.0
    System.out.println(eval("10 2.0 +")); //12.0
    System.out.println(eval("11 3 - 4 + 2.5 *")); //30.0
    System.out.println(eval("8 2 + 99 9 - * 2 + 9 -")); //893.0
    System.out.println(eval("1 2 3 4 5 + * - -")); //26.0
    System.out.println(eval("9 8 -")); //1.0
  }

  static String[] op = {"+", "-", "*", "/", "%"};
  public static double eval(String s){
      String[] in = s.split(" ");
      MyDeque<String> ans = new MyDeque<String>();
      for (String i : in){
        if(i.compareTo("+") == 0){
          ans.addLast("" + (Double.parseDouble(ans.removeLast()) + Double.parseDouble(ans.removeLast())));
        }else if(i.compareTo("-") == 0){
          ans.addLast("" + ((Double.parseDouble(ans.removeLast()) - Double.parseDouble(ans.removeLast())) * -1));
        }else if(i.compareTo("*") == 0){
          ans.addLast("" + (Double.parseDouble(ans.removeLast()) * Double.parseDouble(ans.removeLast())));
        }else if(i.compareTo("/") == 0){
          ans.addLast("" + (1/(Double.parseDouble(ans.removeLast()) / Double.parseDouble(ans.removeLast()))));
        }else if(i.compareTo("%") == 0){
          Double first = Double.parseDouble(ans.removeLast());
          Double second = Double.parseDouble(ans.removeLast());
          ans.addLast("" + (second % first));
        }else{
          ans.addLast(i);
        }
      }
      return Double.parseDouble(ans.removeLast());
  }


}
