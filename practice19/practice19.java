package practice19;

import java.util.*;

// ArrayListは配列と同じようなものだが配列と違って後から要素を追加したり削除したりできる

public class practice19 {
  public static void main(String[] args) {
    List<Integer> sales = new ArrayList<>();
    sales.add(10);    // 要素の追加
    sales.add(20);
    sales.add(30);

    for(int i = 0; i < sales.size(); i++){      // .size()は要素の個数が取得できる
      System.out.println(sales.get(i));      // .get()は要素を取得できる
    }

    sales.set(0, 100);    // .set()は要素の変更（この場合は0番目の要素を100に変更している）
    sales.remove(2);    // remove()は要素の削除ができる

    for(Integer sale : sales){
      System.out.println(sale);
    }
  }
}
