package mypracticepackage;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

  public static void main(String[] args) {
    Map<Integer,String> map = new HashMap<Integer,String>();
    
    map.put(1,"one");
    map.put(2,"two");
    map.put(1, "hello");
    
    for(Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
    

  }

}
