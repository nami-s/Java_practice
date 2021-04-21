package practice2;

public class practice2{
  public static void main(String[] args){
    int i;
    i = 10 / 3;
    System.out.println(i);    // 3
    i = 10 % 3;
    System.out.println(i);    // 1
    int x = 5;
    x++;
    System.out.println(x);    // 6
    x--;
    System.out.println(x);    // 5

    int y = 6;
    y = y + 1;
    System.out.println(y);
    y += 1;
    System.out.println(y);

    String s;
    s = "hello" + "world";    // 文字列の連結
    System.out.println(s);

    double d = 52343.231;
    int e = (int)d;
    System.out.println(e);

    int n = 10;
    double m = (double)n / 4;
    System.out.println(m);
  }
}