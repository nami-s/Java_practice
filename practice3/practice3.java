package practice3;

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

    int i = 0;
    while(i < 10){
      System.out.println(i);
      i++;
    }

    int ii = 0;
    do {
      System.out.println(ii);
      ii++;
    } while(ii < 10);

    for(int a = 0; a < 10; a++){
      System.out.println(a);
    }

    for(int b = 0; b < 10; b++){
      if(b == 5){
        break;
      }
      System.out.println(b);
    }

    for(int c = 0; c < 10; c++){
      if(c == 5){
        continue;
      }
      System.out.println(c);
    }
  }
}