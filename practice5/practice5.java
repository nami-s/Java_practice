package practice5;

class User{  // クラスの作成
  String name;  // フィールド（クラスに属する変数のこと）

  User(String name){    // constructor
    this.name = name;
  }

  void sayHi(){    // メソッドの作成
    System.out.println("Hi!!" + this.name);
  }
}

public class practice5 {
  public static void sayHello(String name){    // メソッドの作成
    System.out.println("Hello " + name);
  }

  public static void sayHello(){    // 引数の個数や型が違えば同じ名前で作成できる（メソッドのオーバーロード）
    System.out.println("Hello everyone");
  }

  public static String sayHi(String name){
    return "Hi! " + name;    // 返り値
  }

  public static void main(String[] args){
    sayHello("Suzuki");    // メソッドの呼び出し
    sayHello();    // 引数がない場合のsayHelloのメソッドの呼び出し
    String msg = sayHi("Yamada");    // 返り値の受け取り
    System.out.println(msg);

    User tom;    // User型を宣言
    tom = new User("Tom");    // 配列と同じようにnewをして領域を確保
    System.out.println(tom.name);
    tom.sayHi();
  }
}
