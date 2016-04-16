package mypracticepackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TreeOrNot {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str;
    List<String> whiteSet = new ArrayList<String>();
    while(sc.hasNextLine()) {
      str = sc.nextLine();
      String[] arr = str.split(" ");
      if (arr.length > 1) {
        whiteSet.add(arr[0]);
        whiteSet.add(arr[1]);
      }
    }
    System.out.println(whiteSet.toString());
  }
    
}
