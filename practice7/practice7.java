package practice7;

class User{
  String name;
  private static int count;

  public User(String name){
    this.name = name;
    User.count++;
  }

  public static void getInfo(){
    System.out.println("# of instances " + User.count);
  }
}

public class practice7 {
  public static void main(String[] args){
    User.getInfo();
    User suzuki = new User("suzuki");
    User.getInfo();
    System.out.println(suzuki.name);
    User yamada = new User("yamada");
    User.getInfo();
    System.out.println(yamada.name);
  }
}
