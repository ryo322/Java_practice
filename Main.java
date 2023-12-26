 class Person {
  private String name;

  public Person(String name) {
    this.name = name; //このthis.は二行目のnameを指している
  }

  public void display() {
    System.out.println("名前：" + name);
  }
}

 class Student extends Person {
  private int stuNo;

  public Student(String name) {
    this(name, 999); //this()はコンストラクタの呼び出し
  }

  public Student(String name, int stuNo) {
    super(name); //superはスーパークラスの呼び出し
    this.stuNo = stuNo;
  }

  public void display() {
    super.display();
    System.out.println("学籍番号:" + stuNo);
  }
}

class  Stusample {
  public static void main(String[] args){
    Student stu = new Student("田中");
    stu.display();
  }
}