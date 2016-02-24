package mypracticepackage;

public class Factorial {
  int Fact(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * Fact(n-1);
    }
  }
  public static void main(String[] args) {
    Factorial f = new Factorial();
    int ans = f.Fact(5);
    System.out.println(ans);
  }

}
