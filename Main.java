 class Person {
  private String name;

  public void setName(String n) {
    name = n;
  }

  public void display() {
    System.out.println("名前" + name);
  }
}

 class Student extends Person {
  private int stuNo;

  public void setStuNo(int s) {
    stuNo = s;
  }

  public void displayStuNo() {
    System.out.println("学籍番号" + stuNo);
  }
}

class  Stusample {
  public static void main(String[] args){
    Student stu = new Student();

    stu.setName("田中");
    stu.display();

    stu.setStuNo(1);
    stu.displayStuNo();
  }
}

//継承とは、既存のクラスをもとに変数やメソッドを追加したクラスを作ること
//継承関係にある親のクラスをスーパークラス、子のクラスをサブクラスという
//継承を使うメリットはコーディング、メンテナンスが楽
//継承できるクラスは１つだけであるのと、コンストラクタは継承しない