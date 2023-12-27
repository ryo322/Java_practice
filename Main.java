 abstract class Club {
  private String name;

  public Club(String name) {
    this.name = name;
  }

  public void display() {
    System.out.println("部活動：" + name);
  }
  public abstract void practice();
}

class TandF extends Club {
  public TandF(String name){
    super(name);
  }

  public void practice(){
    System.out.println("インターバル");
  }
}

class Football extends Club {
  public Football(String name){
    super(name);
  }

  public void practice(){
    System.out.println("ドリブル");
  }
}

 class Student {
  private String name;
  private Club club;

  public Student(String name, Club club){
    this.name = name;
    this.club = club;
  }

  public void display() {
    System.out.println("名前：" + name);
    club.display();
  }

  public void practice() {
    club.practice();
  }
}

class Stusample {
  public static void main(String[] args){
    TandF taf = new TandF("陸上競技部");
    Football fb = new Football("サッカー部");

    Student stu1 = new Student("田中", taf);
    stu1.display();
    stu1.practice();

    Student stu2 = new Student("佐藤", fb);
    stu2.display();
    stu2.practice();
    }
}

//実装内容を持たないメソッドを抽象メソッドと呼び、abstractをつける
//抽象メソッドを持つクラスを抽象クラスと呼びabstractをつける。インスタンス化はできない