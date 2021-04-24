package com.practice.myapp.model;

public class User{  // クラスの作成（親クラス）
  protected String name;  // フィールド（クラスに属する変数のこと）

  public User(String name){    // constructor
    this.name = name;
  }

  public void sayHi(){    // メソッドの作成
    System.out.println("Hi!!" + this.name);
  }
}
