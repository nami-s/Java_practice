package practice16;

public class practice16 {
  public static void main(String[] args) {
    String s = "abcdef";
    System.out.println(s.length());    // 文字列の文字数を返すメソッド(6)
    System.out.println(s.substring(2, 5));    // 部分文字列を返すメソッド(cde)
    System.out.println(s.replace("ab", "AB"));    // 置換をしてくれるメソッド(Abcdef)

    String s1 = "ab";
    String s2 = "ab";
    if(s1.equals(s2)){      // 文字列の内容を比較するメソッド
      System.out.println("same!");
    }

    if(s1 == s2){
      System.out.println("same!same!");
    }

    String ss1 = new String("ab");
    String ss2 = new String("ab");
    if(ss1 == ss2){
      System.out.println("same!same!same!");
    }
  }
}
