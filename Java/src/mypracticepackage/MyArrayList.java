package mypracticepackage;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    List<String> sampleStrings = new ArrayList<String>();
    sampleStrings.add("kavitha");
    sampleStrings.add(0, "Rahul");
    System.out.println(sampleStrings.contains("kavitha"));

    
    System.out.println(sampleStrings);
  }

}
