package mypracticepackage;

import java.util.*;

public class ReversePolishNotation {
  
  public static void main(String args[] ) throws Exception {
    Scanner sc = new Scanner(System.in);
    String str;
    System.out.println("Enter Number");
    Stack<String> stack = new Stack<String>();
    str = sc.nextLine();
    String[] arr = str.split(" ");
    System.out.println(Arrays.toString(arr));
    for(String ele : arr) {
      if (ele.matches("^\\d+$")) {
        stack.push(ele);
      } else {
        computeStack(stack,ele);
      }
    }
    System.out.println(stack.pop());
  }

  private static void computeStack(Stack<String> stack, String str) {
    Integer firstNumber;
    Integer secondNumber;
    secondNumber = Integer.parseInt(stack.pop());
    firstNumber = Integer.parseInt(stack.pop());
    switch(str) {
    case "+":
       stack.push(String.valueOf(firstNumber + secondNumber));
       break;
    case "-":
      stack.push(String.valueOf(firstNumber - secondNumber));
      break;
    case "*":
      stack.push(String.valueOf(firstNumber * secondNumber));
      break;
    case "/":
      stack.push(String.valueOf(firstNumber / secondNumber));
      break;
    }
  } 
}
