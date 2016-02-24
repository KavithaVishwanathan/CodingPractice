package kavitha.practice;

public class LinkedList<T> {
  Node<T> head;
  
  public void add(T value){
    if (head == null) {
      head = new Node<T>(value, null);
    } else {
      Node<T> currentNode = head;
      while (currentNode.nextNode != null ) {
        currentNode = currentNode.nextNode;
      }
      Node<T> newNode = new Node<T>(value,null);
      currentNode.nextNode = newNode;
    }
  }
  
  public void delete(T value) {
    if (head.value == value) {
      head  = head.nextNode;
    } else {
      Node<T> currentNode = head;
      Node<T> prevNode = null;
      while (currentNode != null && currentNode.value != value){
        prevNode = currentNode;
        currentNode = currentNode.nextNode;
      }
      if (currentNode != null) {
        prevNode.nextNode = currentNode.nextNode;
      } else {
        System.out.println("A node with that value does not exist.");
      }
    }
    
  }
  /*
  public LinkedList<T> mergeList(LinkedList<T> l1, LinkedList<T> l2) {
    LinkedList<T> result;
    Node<T> curL1 = l1.head;
    Node<T> curL2 = l2.head;
    while (curL1.nextNode != null && curL2.nextNode != null) {
      if (curL1.value > curL2.value) {
        result.add(curL1.value);
      }
    }
    return result;
  }
  */
  @Override
  public String toString() {
    return "LinkedList [head=" + head + "]";
  }
}
