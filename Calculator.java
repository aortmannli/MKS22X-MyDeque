import java.lang.*;
import java.io.*;
import java.util.*;

public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    static String[] op = {"+", "-", "*", "/", "%"};
    public static double eval(String s){
      String[] in = s.split(" ");
      MyDeque<String> ans = new MyDeque<String>(in.length);
      for(String i : in){
          if(i.compareTo("+") == 0){
            ans.addLast("" + Double.parseDouble(ans.removeLast()) + Double.parseDouble(ans.removeLast()));
          }else if(i.compareTo("-") == 0){
            ans.addLast("" + ((Double.parseDouble(ans.removeLast()) - Double.parseDouble(ans.removeLast())) * -1));
          }else if(i.compareTo("*") == 0){
            ans.addLast("" + (Double.parseDouble(ans.removeLast()) * Double.parseDouble(ans.removeLast())));
          }else if(i.compareTo("/") == 0){
            ans.addLast("" + (1/(Double.parseDouble(ans.removeLast()) / Double.parseDouble(ans.removeLast()))));
          }else if(i.compareTo("%") == 0){
            ans.addLast("" + (Double.parseDouble(ans.removeLast()) % Double.parseDouble(ans.removeLast())));
          }else{
            ans.addLast(i);
          }
      }
      return Double.parseDouble(ans.removeLast());
    }


}
