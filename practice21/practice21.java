package practice21;

import java.util.*;

// HashMapはkeyとvalueでデータを管理する、データの保持の順番は不定
// TreeMapはkeyの順番でデータが保持される
// LinkedHashMapはデータが追加された順番で保持される

public class practice21 {
  public static void main(String[] args) {
    // HashMap<String, Integer> sales = new HashMap<>();
    Map<String, Integer> sales = new HashMap<>();

    sales.put("suzuki", 10);    // 要素を追加している
    sales.put("yamada", 20);
    sales.put("oka", 30);

    System.out.println(sales.get("suzuki"));    // keyがsuzukiのvalueを表示
    System.out.println(sales.size());    // 要素の個数を表示

    for(Map.Entry<String, Integer> sale : sales.entrySet()){
      System.out.println(sale.getKey() + ":" + sale.getValue());      // salesのkeyとvalueの両方を表示
    }

    sales.put("suzuki", 100);    // 値の更新
    sales.remove("oka");    // 要素の削除

    for(Map.Entry<String, Integer> sale : sales.entrySet()){
      System.out.println(sale.getKey() + ":" + sale.getValue());
    }
  }
}
