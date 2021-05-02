package practice20;

import java.util.*;

// HashSetクラスは要素の重複を許さずデータを保存する順番が定まらない
// TreeSetクラスは値順にソートされてデータを保持する
// LinkedHashSetは追加された順にデータを保持する

public class practice20 {
  public static void main(String[] args) {
    // HashSet<Integer> sales = new HashSet<>();
    Set<Integer> sales = new HashSet<>();
    sales.add(10);
    sales.add(20);
    sales.add(30);
    sales.add(10);

    System.out.println(sales.size());

    for(Integer sale : sales){
      System.out.println(sale);
    }

    sales.remove(30);
    System.out.println(sales.size());

    for(Integer sale : sales){
      System.out.println(sale);
    }
  }
}
