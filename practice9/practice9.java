package practice9;

// 抽象クラス（他のクラスに継承してもらうことを前提にしているクラス）
// 具象クラス（抽象クラスを継承するクラス）

abstract class User{
  public abstract void sayHi();  // 抽象メソッド
}

class JapaneseUser extends User{
  @Override
  public void sayHi(){
    System.out.println("こんにちは");
  }
}

class AmericanUser extends User{
  @Override
  public void sayHi(){
    System.out.println("Hi");
  }
}

public class practice9 {
  public static void main(String[] args){
    JapaneseUser suzuki = new JapaneseUser();
    AmericanUser tom = new AmericanUser();
    suzuki.sayHi();
    tom.sayHi();
  }
}
