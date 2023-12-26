 class Person {
  private String name;

  public void setName(String n) {
    name = n;
  }
  public String getName() {
    return name;
  }

  public void display() {
    System.out.println("名前：" + name);
  }
}

 class Student extends Person {
  private int stuNo;

  public void setStuNo(int s) {
    stuNo = s;
  }

  public void display() {
    System.out.println("名前：" + getName());
    System.out.println("学籍番号" + stuNo);
  }
}

class  Stusample {
  public static void main(String[] args){
    Student stu = new Student();

    stu.setName("田中");
    stu.setStuNo(1);
    stu.display();
  }
}

//サブクラスでスーパークラスのメソッドを再定義することをオーバーライドという
//オーバーライドの条件は、戻り値の型、メソッド名、引数の型と数がスーパークラスとサブクラスで同じであること