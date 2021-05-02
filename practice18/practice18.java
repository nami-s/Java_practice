package practice18;

import java.util.Random;

public class practice18 {
  public static void main(String[] args) {
    double d = 53.234;
    System.out.println(Math.ceil(d));    // 小数点以下切り上げ
    System.out.println(Math.floor(d));    // 小数点以下切り捨て
    System.out.println(Math.round(d));    // 小数点以下四捨五入
    System.out.println(Math.PI);    // 円周率

    Random r = new Random();
    System.out.println(r.nextDouble());    // 0から1未満
    System.out.println(r.nextInt(100));    // 0から100未満
    System.out.println(r.nextBoolean());    // ランダムなtrue/false
  }
}
