package com.practice.myapp.model;

public class AdminUser extends User{  // クラスの継承（子クラス）
  public AdminUser(String name){
    super(name);
  }

  public void sayHello(){
    System.out.println("Hello! " + this.name);
  }

  @Override  // オーバーライドしていることを明示的に示している
  public void sayHi(){    // メソッドのオーバーライド
    System.out.println("[admin] Hi!!! " + this.name);
  }
}