package practice5;

public class practice5 {
  public static void sayHello(String name){    // メソッドの作成
    System.out.println("Hello " + name);
  }

  public static String sayHi(String name){
    return "Hi! " + name;    // 返り値
  }

  public static void main(String[] args){
    sayHello("Suzuki");    // メソッドの呼び出し
    String msg = sayHi("Yamada");    // 返り値の受け取り
    System.out.println(msg);
  }
}
