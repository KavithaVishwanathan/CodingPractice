package mypracticepackage;

public class Stack {
  private int top = -1;
  private int size;
  private int[] myStack;
  
  Stack(int size) {
    this.size = size;
    myStack = new int[size];
  }
  
  void push(int value) {
    if (top + 1 == size) {
      System.out.println("Stack is full");
    } else {
      myStack[++top] = value;
    }
  }
  
  int pop() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return 0;
    } else {
      return myStack[top--];
    }
  }
 
  public static void main(String[] args) {
    Stack stack = new Stack(5);
    System.out.println(stack.pop());
    stack.push(4);
    stack.push(6);
    stack.push(7);
    stack.push(8);
    stack.push(9);
    stack.push(10);
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }

}
