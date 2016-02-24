package kavitha.practice;

public class TestingClass {
  public static void main(String args[]){
    LinkedList<Integer> mylist = new LinkedList<Integer>();
    mylist.add(1);
    mylist.add(2);
    mylist.add(3);
    mylist.delete(2);
    System.out.println(mylist);
  }

}
