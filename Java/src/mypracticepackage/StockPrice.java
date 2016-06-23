package mypracticepackage;

public class StockPrice {
  
  private static StockPrice instance;
  
  private int maxPrice = 0;
  private int buyPrice;
  private int sellPrice;
  
  private StockPrice(int bp) {
    buyPrice = bp;
    sellPrice = bp;
  }
  
  public static StockPrice getInstance(int bp) {
    if (instance == null) {
      instance = new StockPrice(bp);
    }
    return instance;
  }
  
  public static void main(String[] args) {
    int[] spy = {10, 7, 5, 8, 11, 9};
    //int[] spy = {10, 9, 8, 7, 6, 5};
    StockPrice sp  = getInstance(spy[1]);
    sp.getMaxProfit(spy);
  }
  
  public int getMaxProfit(int[] stockPricesYesterday) {
    //int sellPrice = 0;
    for (int value : stockPricesYesterday) {
      //to Update sellPrice
      if ((value > buyPrice) || (value > sellPrice)) {
        sellPrice = value;
      } else if (value < buyPrice) {
        buyPrice = value;
        sellPrice = value;
      } 
      
      if (maxPrice < (sellPrice - buyPrice)) {
        maxPrice = sellPrice - buyPrice;
      }
 
    }
    System.out.println(sellPrice);
    System.out.println(buyPrice);
    System.out.println(maxPrice);
    return maxPrice;
  }

}
