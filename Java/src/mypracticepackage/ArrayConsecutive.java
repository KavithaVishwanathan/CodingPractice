package mypracticepackage;

import java.util.Scanner;

public class ArrayConsecutive {
  public static void main(String[] args) {
    ArrayConsecutive arrayExample = new ArrayConsecutive();
    Scanner sc = new Scanner(System.in); 
    int[] numbers = new int[5];

    for (int i = 0; i < numbers.length; i++) {
        System.out.println("Please enter number");
        numbers[i] = sc.nextInt();
    }
    System.out.println(arrayExample.go(numbers));
  }

  private boolean go(int[] numbers) {
    for (int i=1; i<numbers.length; i++) {
      if (numbers[i] - numbers[i-1] == 1) {
        return true;
      }
    }
    return false;
  }

}
