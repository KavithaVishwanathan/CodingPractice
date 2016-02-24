package kavitha.practice;

class Node<T> {
  
  Node<T> nextNode;
  T value;
  
  Node (T value, Node<T> nextNode) {
    this.value = value;
    this.nextNode = nextNode;
  }

  @Override
  public String toString() {
    return "Node [value=" + value + ",nextNode=" + nextNode + "]";
  }
}
