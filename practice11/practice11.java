package practice11;

enum Result {  // 列挙型（クラスのように自分で作成できるデータ型）
  SUCCESS,
  ERROR,
}

public class practice11 {
  public static void main(String[] args){
    Result res;
    res = Result.ERROR;
    switch (res) {
      case SUCCESS:
        System.out.println("OK");
        System.out.println(res.ordinal());
        break;
      case ERROR:
        System.out.println("NG!");
        System.out.println(res.ordinal());
        break;
    }
  }
}
