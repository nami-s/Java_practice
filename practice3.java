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

    String signal = "red";
    switch (signal) {
      case "red":
        System.out.println("stop!");
        break;
      case "blue":
        System.out.println("go!");
        break;
      case "yellow":
        System.out.println("caution!");
        break;
      default:
        System.out.println("wrong signal");
        break;
    }
  }
}