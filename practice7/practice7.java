package practice7;

class User{
  String name;
  private static int count = 0;  // クラス変数

  static{    // staticイニシャライザ
    System.out.println("Static initializer");
  }

  {    // インスタンスイニシャライザ
    System.out.println("instances initializer");
  }

  public User(String name){    // コンストラクタ
    this.name = name;
    User.count++;
    System.out.println("Constructor");
  }

  public static void getInfo(){    // クラスメソッド
    System.out.println("# of instances " + User.count);
  }
}

public class practice7 {
  public static void main(String[] args){
    User.getInfo();    // 0
    User suzuki = new User("suzuki");
    User.getInfo();    // 1
    System.out.println(suzuki.name);
    User yamada = new User("yamada");
    User.getInfo();    // 2
    System.out.println(yamada.name);
  }
}
