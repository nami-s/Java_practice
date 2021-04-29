package practice14;

// ジェネリクス

class MyData<T>{
  public void getThree(T x){
    System.out.println(x);
    System.out.println(x);
    System.out.println(x);
  }
}

public class practice14 {
  public static void main(String[] args){
    MyData<Integer> i = new MyData<>();
    i.getThree(32);
    MyData<String> s = new MyData<>();
    s.getThree("hello");
  }
}
