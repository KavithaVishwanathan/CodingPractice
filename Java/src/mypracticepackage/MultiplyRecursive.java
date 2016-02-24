package mypracticepackage;

public class MultiplyRecursive {
  private int sum = 0;
  int mul(int a, int b){
    if (b != 0) {
      return mul(a,b-1) + a;
    }
    return sum;
  }
  public static void main(String[] args) {
    MultiplyRecursive ans = new MultiplyRecursive();
    int result = ans.mul(2,3);
    System.out.println(result);
  }

}
