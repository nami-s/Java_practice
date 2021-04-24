package practice6;

class User{
  private String name;
  private int score;

  public User(String name, int score){
    this.name = name;
    this.score = score;
  }

  public int getScore(){    // getter
    return this.score;
  }

  public void setScore(int score){    // setter
    if(score > 0){
      this.score = score;
    }
  }
}

public class practice6 {
  public static void main(String[] args){
    User suzuki = new User("Suzuki", 65);
    suzuki.setScore(85);
    suzuki.setScore(-22);
    System.out.println(suzuki.getScore());
  }
}
