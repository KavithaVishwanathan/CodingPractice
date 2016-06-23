package mypracticepackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//import java.util.concurrent.ConcurrentLinkedDeque;

public class CodingQuestion {
  LinkedList<Integer> ll = new LinkedList<Integer>();
  
  public static void main (String[] args) {
    CodingQuestion instance = new CodingQuestion();
    instance.go();
  }
  
  void go() {
    ll.add(1);
    ll.add(2);
    LinkedList<Integer> ll_copy = (LinkedList<Integer>) ll.clone();
    
    Iterator<Integer> iter = ll.iterator();
    
    while (iter.hasNext()) {
      Integer num = iter.next();
      if (num == 2) {
        ll_copy.add(ll_copy.indexOf(2),22);
      }
    }
    
    Iterator<Integer> iter_copy = ll_copy.iterator();
    
    while (iter_copy.hasNext()) {
      System.out.println(iter_copy.next());
    }
  } 
}
