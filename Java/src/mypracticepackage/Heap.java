package mypracticepackage;

import java.util.Arrays;
import java.util.Collections;

public class Heap {
  
  private long[] myHeap;
  private int n;
  
  public static void main(String[] args) {
    //long[] givenArray = {752,5,72,6,478,46,33,8,55,77,23,953,87};
    long[] givenArray = {6, 5, 8, 23, 33, 46, 55, 72, 77, 87, 478, 752, 953};
    Heap heap = new Heap();
    heap.sort(givenArray);
  }
  
  private void sort(long[] array) {
    this.myHeap = array;
    this.n = myHeap.length - 1;
    System.out.println(Arrays.toString(myHeap));
    System.out.println("-------------------------------------------------");
    buildHeap();
    System.out.println(Arrays.toString(myHeap));
    //heapSort();
    System.out.println(maximum());
    //System.out.println(extractMax());
    increaseKey(5,1000);
    System.out.println(Arrays.toString(myHeap));
  }
    
  private void maxHeapify(int root) {
    int largeElement = root;
    int left = 2 * root + 1;
    int right = 2 * root + 2;
    
    if ((left <= n) && ( myHeap[left] > myHeap[largeElement] )){
      largeElement = left;
    }
    
    if ((right <= n) && (myHeap[right] > myHeap[largeElement])) {
      largeElement = right;
    }
    
    if(largeElement != root) {
      swapPositions(root,largeElement);
      maxHeapify(largeElement);
    }
  }
  
  private void buildHeap() {
    for (int i = n/2; i >= 0; i--) {
      maxHeapify(i);
      //System.out.println(Arrays.toString(myHeap));
    }
  }
  
  private void heapSort() {
    for(int i=n; i>=0; i--) {
      swapPositions(0,i);
      n=n-1;
      maxHeapify(0);
    }  
  }
  
  private long maximum() {
      return myHeap[0];
  }
  
  private long extractMax() {
    long max = myHeap[0];
    swapPositions(0, n);
    n=n-1;
    buildHeap();
    return max;
  }
  
  private void increaseKey(int i, long key) {
    if (key < myHeap[i]) {
      System.out.println("error! key is smaller than the current key");
    } else {
      myHeap[i] = key;
      while ((i >= 0) && (myHeap[i/2] < myHeap[i])) {
        swapPositions(i, i/2);
        i = i/2;
      }
    }
  }
  
  private void swapPositions(int i, int j) {
    long temp = myHeap[i];
    myHeap[i] = myHeap[j];
    myHeap[j] = temp;
  }
}
