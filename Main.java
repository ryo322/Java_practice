 class Person {
  private String name;

  public Person(String name) {
    this.name = name;
  }

  public void display() {
    System.out.println("名前：" + name);
  }
}

 class Student extends Person {
  private int stuNo;

  public Student(String name, int stuNo){
    super(name);
    this.stuNo = stuNo;
  }

  public void display() {
    super.display();
    System.out.println("学籍番号：" + stuNo);
  }

  public void chgStuNo(int stuNo) {
    this.stuNo = stuNo;
  }
}

class Stusample {
  public static void main(String[] args){
    Student stu1 = new Student("田中", 1);
    Person psn = stu1;
    psn.display();

    if(psn instanceof Student){  //オブジェクトのクラスを特定するinstanceofキーワード。　対象オブジェクト　instanceof クラス名と記述
      Student stu2 = (Student)psn;
      stu2.chgStuNo(1001);
      stu2.display();
    }
  }
}

/*継承関係にあるクラス同士でオブジェクトの型変換が
自動で行われる：スーパー＝サブの時
キャストで明示する：サブ＝スーパーの時*/