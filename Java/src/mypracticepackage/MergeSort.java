package mypracticepackage;

import java.util.Arrays;

public class MergeSort {
  private long[]  myArray;
  
  public static void main(String[] args) {
    long[] givenArray = {752,5,72,6,478,46,33,8,55,77,33,953,87};
    MergeSort mergeSort = new MergeSort();
    mergeSort.doSort(givenArray);
  }
  
  private void doSort(long[] myArray) {
    this.myArray = myArray;
    System.out.println(Arrays.toString(myArray));
    System.out.println("-------------------------------------------------");
    mergeSort(0,myArray.length - 1);
    System.out.println(Arrays.toString(myArray));
  }
  
  private void mergeSort(int p,int r) {
    if (p < r) {
      int q = (p+r)/2;
      mergeSort(p,q);
      mergeSort(q+1, r);
      merge(p,q,r);
    }
  }
  
  private void merge(int p, int q, int r) {
    int i = 0;
    int j = 0;
    int k = p;
    long[] leftArr = new long[q-p+1];
    long[] rightArr = new long[r-q];
    
    for(int x = 0; x < q-p+1; x++) {
      leftArr[x] = myArray[x+p];
    }
    
    for(int x = 0; x < r-q; x++) {
      rightArr[x] = myArray[x+q+1];
    }
  
    
    while ((i < q-p+1) && (j < r-q)) {
      if (leftArr[i] < rightArr[j]) {
        myArray[k] = leftArr[i];
        i++;
      } else  {
        myArray[k] = rightArr[j];
        j++;
      }
      k++;
    }
    
    while (i < q-p+1) {
      myArray[k] = leftArr[i];
      i++;
      k++;
    }
    
    while (j < r-q) {
      myArray[k] = rightArr[j];
      j++;
      k++;
    }
      
     System.out.println(Arrays.toString(myArray));
    
  }
  
}
