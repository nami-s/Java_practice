package practice15;

// Thread処理

// class MyRunnable implements Runnable{  // 関数型インターフェース
//   @Override
//   public void run(){
//     for(int i = 0; i < 500; i++){
//       System.out.print('*');
//     }
//   }
// }

// public class practice15 {
//   public static void main(String[] args){
//     MyRunnable r = new MyRunnable();
//     Thread t = new Thread(r);
//     t.start();
//     for(int i = 0; i <500; i++){
//       System.out.print('.');
//     }
//   }
// }




// ⬆️を省略した書き方

public class practice15{
  public static void main(String[] args){

    // new Thread(new Runnable(){      // 無名クラス
    //   @Override
    //   public void run(){
    //     for(int i = 0; i < 500; i++){
    //       System.out.print('*');
    //     }
    //   }
    // }).start();


    // ラムダ式　(引数) -> {処理}
    new Thread(() -> {
      for(int i = 0; i < 500; i++){
        System.out.print('*');
      }
    }).start();


    for(int i = 0; i < 500; i++){
      System.out.print('.');
    }
  }
}
