package mypracticepackage;

import java.io.*;
import java.util.*;


public class FindBomb {
  private int index = 0;
  private int[] arr;
  private int consecutiveCount = 0;
  
  FindBomb(int[] arr) {
    this.arr = arr;
  }
  
  static boolean contains_bomb(int[] arr) {
    Solution solution = new Solution(arr);
    return solution.go();
  }
  
  boolean go() {
    if (index > arr.length -3) {
      return false;
    }
    
    if (isValidSameAndConsecutive()) { 
      if((isValidSameAndConsecutive())) {
        if((isValidSameAndConsecutive())) {
        } else {
          go();
        }
      } else {
        go();
      }
    } else {
      go();
    }
    
    if (consecutiveCount > 2) {
      return true;
    } else {
      return false;
    }
  }
  
  boolean isValidSameAndConsecutive(){
    if (isValidSame()) {
      consecutiveCount ++;
      if (isConsecutive()) {
        return true;
      } else {
        consecutiveCount = 0;
        return false;
      }
    }
    consecutiveCount = 0;
    index=index+1;
    return false;
  }
  
  boolean isValidSame() {
    int i;
    for (i=index;i<arr.length -1;i++) {
      if (arr[i] != arr[i+1]) {
        if (index - i != 0) {
          index = i;
          return true;
        } else {
          return false;
        }
      }
    }
    index = i;
    return true;
  }
  
  boolean isConsecutive() {
    if (index == arr.length - 1) {
      return false;
    }
    if (arr[index+1] - arr[index] == 1) {
      index = index+1;
      return true;
    }
    return false;
  }
  
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    //final String fileName = System.getenv("OUTPUT_PATH");
    //BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
    boolean res;
    
    int _arr_size = Integer.parseInt(in.nextLine());
    int[] _arr = new int[_arr_size];
    int _arr_item;  
    for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
        _arr_item = Integer.parseInt(in.nextLine());
        _arr[_arr_i] = _arr_item;
    }
    
    res = contains_bomb(_arr);
    System.out.println(res);
  }

}
