public class practice3{
  public static void main(String[] args){
    int score = 90;
    if(80 < score){
      System.out.println("Great!!");
    } else if(60 < score){
      System.out.println("Good!");
    } else{
      System.out.println("Bad..");
    }

    String msg = 80 < score ? "aaa" : "bbb";
    System.out.println(msg);
  }
}