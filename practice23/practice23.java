package practice23;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class practice23 {
  public static void main(String[] args) {
    LocalDateTime d = LocalDateTime.now();    // 現在時刻
    // LocalDateTime d = LocalDateTime.of(2020, 1, 12, 10, 10, 10);    // 特定の日時を取得(2020年1月12日10時10分10秒)
    // LocalDateTime d = LocalDateTime.parse("2020-01-12T10:10:10");    // 特定の日時を取得(2020年1月12日10時10分10秒)

    System.out.println(d.getYear());    // 年を取得
    System.out.println(d.getMonth());    // 月を英語で取得
    System.out.println(d.getMonth().getValue());    // 月を数字で取得

    System.out.println(d.plusMonths(2).minusDays(3));    // 日時計算（2ヶ月分足して3日分引く）

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");    // 好きなフォーマットを指定
    System.out.println(d.format(dtf));    // 作成したフォーマットで出力
  }
}
