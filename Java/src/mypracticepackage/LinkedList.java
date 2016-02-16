package mypracticepackage;

import java.util.NoSuchElementException;

public class LinkedList<AnyType> {
  
  //inner class for Node
  private static class Node<AnyType> {
    private AnyType data;
    private Node<AnyType> next;
    
    public Node(AnyType data, Node<AnyType> next) {
      this.data = data;
      this.next = next;
    }
  }
  
  //create head
  private Node<AnyType> head;
  
  //create empty list
  public LinkedList() {
    head = null;
  }
  
  //add first element to the list
  public void addFirst(AnyType data) {
    head = new Node<AnyType>(data, null);
  }
  
  public Node<AnyType> getFirst() {
    if (head==null) throw new NoSuchElementException();
    return head;
  }

  public void removeFirst() {
    if (head==null) throw new NoSuchElementException();
    head = head.next;
  }
  
  public void addLast(AnyType data){
    if (head == null) {
      addFirst(data);
    }
    else {  
      Node<AnyType> temp = head;
      while (temp.next != null){
        temp = temp.next;
      }
      temp.next = new Node<AnyType>(data, null);
    }
   }
 
}
