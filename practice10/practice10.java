package practice10;

interface Printable{  // 定数、抽出、default、staticメソッドを記述できる
  double VERSION = 1.2;
  void print();
  public default void getInfo(){
    System.out.println("I/F ver " + Printable.VERSION);
  }
}

class User implements Printable{
  @Override
  public void print(){
    System.out.println("Now printing user profile...");
  }
}

public class practice10 {
  public static void main(String[] args){
    User tom = new User();
    tom.print();
    tom.getInfo();
  }
}
