package practice22;

import java.util.*;

public class practice22 {
  public static void main(String[] args) {
    List<Integer> sales = new ArrayList<>(Arrays.asList(12, 30, 22, 4, 9));

    sales
      .stream()
      // 中間処理
      .filter(e -> e % 3 == 0)      // ラムダ式（引数 -> 処理)）
      .map(e -> "(" + e + ")")
      // 終端処理
      .forEach(System.out::println);
  }
}
