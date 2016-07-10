package mypracticepackage;

import java.util.Arrays;

public class QuickSort {
  
  private long[] myArray;

  public static void main(String[] args) {
    long[] givenArray = {752,5,72,6,478,46,33,8,55,77,23,953,87};
    QuickSort quickSort = new QuickSort();
    quickSort.doSort(givenArray);
  }
  
  private void doSort(long[] myArray) {
    this.myArray = myArray;
    System.out.println(Arrays.toString(myArray));
    System.out.println("-------------------------------------------------");
    quickSort(0,myArray.length - 1);
    System.out.println(Arrays.toString(myArray));
  }
  
  private void quickSort(int p,int r) {
    if (p<r) {
      int q = partition(p,r);
      quickSort(p, q-1);
      quickSort(q+1, r);
    }
  }
  
  private int partition(int start, int end) {
    long pivot = myArray[(start+end)/2];
    int i = start;
    int j = end;
    
    while (i < j) {
      while (myArray[i] < pivot) {
        i++;
      }
      
      while (myArray[j] > pivot) {
        j--;
      }
      
      swapPositions(i,j);
      
    }
    
    //swapPositions(i+1,(start+end)/2);
    return i;
  }
  
  private void swapPositions(int i, int j) {
    long temp = myArray[i];
    myArray[i] = myArray[j];
    myArray[j] = temp;
  }

}
