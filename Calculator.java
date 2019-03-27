import java.lang.*;
import java.io.*;
import java.util.*;

public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    static String[] op = {"+", "-", "*", "/", "%"}
    public static double eval(String s){
      String[] in = String.split(s);
      MyDeque<String> ans = new MyDeque<String>(in.length);
      for(String i : in){
        if(operations.contains(i)){
          if(i.compareTo("+") == 0){
            ans.addLast("" + Double.parseDouble(ans.removeLast()) + Double.parseDouble(ans.removeLast());
          }else if(i.compareTo("-") == 0){
            ans.addLast("" + Double.parseDouble(ans.removeLast()) + Double.parseDouble(ans.removeLast());
          }else if(i.compareTo("*") == 0){
            ans.addLast("" + Double.parseDouble(ans.removeLast()) + Double.parseDouble(ans.removeLast());
          }else if(i.compareTo("/") == 0){
            ans.addLast("" + Double.parseDouble(ans.removeLast()) + Double.parseDouble(ans.removeLast());
          }else if(i.compareTo("%") == 0){
            ans.addLast("" + Double.parseDouble(ans.removeLast()) + Double.parseDouble(ans.removeLast());
          }else{

          }
        }
      }
    }


}
