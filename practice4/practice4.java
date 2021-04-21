package practice4;

public class practice4 {
  public static void main(String[] args){
    //  配列

    int[] sales;    // 配列の宣言
    sales = new int[3];    // データ領域の確保

    sales[0] = 100;
    sales[1] = 200;
    sales[2] = 300;
    System.out.println(sales[1]);

    sales[1] = 1000;
    System.out.println(sales[1]);
  }
}
