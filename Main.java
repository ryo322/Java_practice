 class Person {
  private String name;

  public Person(String name) {
    this.name = name;
  }

  public void display() {
    System.out.println("名前：" + name);
  }
}

 final class Student extends Person {
  private int stuNo;

  public Student(String name, int stuNo) {
    super(name); 
    this.stuNo = stuNo;
  }

  public void display() {
    super.display();
    System.out.println("学籍番号:" + stuNo);
  }
}

class  Stusample {
  public static void main(String[] args){
    final int BASE_NO = 1000;
    Student stu1 = new Student("田中",BASE_NO+1);
    stu1.display();
    Student stu2 = new Student("佐藤",BASE_NO+2);
    stu2.display();
  }
}

//finalキーワードはクラス、メンバ変数、メソッドにつけられる修飾子。”これで最後”という意味
//[クラス]継承ができなくなる
//[メソッド]オーバーライドができなくなる
//[メンバ変数]変数への代入ができなくなる→定数を作れる(定数名はすべて大文字)
