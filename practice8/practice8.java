package practice8;

// final：変更が出来ないという意味、クラス、メソッド、フィールド全てに適用可

class User{
  protected String name;
  private static final double VERSION = 1.1;  // 定数になる

  public User(String name){
    this.name = name;
  }

  public void sayHello(){
    System.out.println("Hello! " + this.name);
    System.out.println(User.VERSION);
  }
}

class AdminUser extends User{
  public AdminUser(String name){
    super(name);
  }
  @Override
  public void sayHello(){
    System.out.println("[admin] Hello! " + this.name);
  }
}

public class practice8 {
  public static void main(String[] args){
    User suzuki = new User("suzuki");
    System.out.println(suzuki.name);
  }
}
