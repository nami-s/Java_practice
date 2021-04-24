package com.practice.myapp;
import com.practice.myapp.model.User;
import com.practice.myapp.model.AdminUser;
// import com.practice.myapp.model.*;    // .myapp.modelのしたにあるクラスを全部読み込むワイルドカード

public class MyApp {
  public static void main(String[] args){
    User tom = new User("tom");    // 配列と同じようにnewをして領域を確保
    // System.out.println(tom.name);
    tom.sayHi();

    AdminUser bob = new AdminUser("bob");
    // System.out.println(bob.name);
    bob.sayHi();
    bob.sayHello();
  }
}
