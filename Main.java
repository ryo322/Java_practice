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

interface Englishable {
  String LANGUAGE = "[英語]";
  void displayEng();
}

class Baseball implements Englishable {
  public void display(){
    System.out.println("キャッチボール");
  }

  public void displayEng(){
    System.out.println(Englishable.LANGUAGE);
    System.out.println("catch ball");
  }
}

 class Student implements Englishable {
  private String name;

  public Student(String name){
    this.name = name;
  }

  public void display() {
    System.out.println("名前：" + name);
  }

  public void displayEng() {
    System.out.println(Englishable.LANGUAGE);
    System.out.println("NAME:" + name);
  }
}

class Stusample {
  public static void main(String[] args){
    Student stu1 = new Student("Mike");
    stu1.displayEng();

    Baseball bb = new Baseball();
    bb.displayEng();
    }
}

//インターフェースは定数と抽象メソッドのみを定義できる
//インターフェースを実装したクラスでは全てのメソッドの処理を定義する
//インターフェースは複数実装できる