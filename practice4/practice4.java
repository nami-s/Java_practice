package practice4;

public class practice4 {
  public static void main(String[] args) {
    // 配列

    int[] sales; // 配列の宣言
    sales = new int[3]; // データ領域の確保

    sales[0] = 100;
    sales[1] = 200;
    sales[2] = 300;
    System.out.println(sales[1]);

    sales[1] = 1000;
    System.out.println(sales[1]);

    // 配列をまとめて初期化(宣言と初期化を分ける方法)
    int[] sales1;
    sales1 = new int[] {100, 200, 300};
    System.out.println(sales1[1]);

    // 配列をまとめて初期化（宣言と初期化を分けない方法）
    int[] sales2 = {100, 200, 300};
    System.out.println(sales2[1]);

    int[] sales3 = {700, 400, 500};
    for(int i = 0; i < sales3.length; i++){
      System.out.println(sales3[i]);
    }

    int[] sales4 = {700, 400, 500};
    for(int sale : sales4){
      System.out.println(sale);
    }
  }
}
