package practice12;

// 例外処理

class MyException extends Exception{
  public MyException(String s){
    super(s);
  }
}

public class practice12 {
  public static void div(int a, int b){
    try{
      if(b < 0){
        throw new MyException("not minus!");
      }
      System.out.println(a / b);
    }catch(ArithmeticException e){
      System.err.println(e.getMessage());
    }catch(MyException e){
      System.err.println(e.getMessage());
    }finally{
      System.out.println("-- end --");
    }
  }

  public static void main(String[] args){
    div(3, 0);
    div(5, -2);
    div(6, 2);
    div(3, 2);
  }
}
