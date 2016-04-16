package mypracticepackage;

import java.util.Scanner;

public class StairCase {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n;
    n = Integer.parseInt(in.nextLine().trim());
    StairCaseSolve(n);

  }

  private static void StairCaseSolve(int n) {
    StairCase solution = new StairCase();
    solution.go(n);
  }
  
  void go(int n) {
    StringBuffer sb = new StringBuffer();
    int i = 0;
    while (i<n) {
      sb.append(" ");
      i++;
    }
    System.out.println(sb);
    for (int j = n; j > 0; j--) {
      sb.replace(j-1, j, "#");
      System.out.println(sb);
    }
  }

}
