class Student2 {
  String name;
  int engScore;
  int mathScore;

  void setData(String n){
    name = n;
  }

  void setData(String n, int e, int m) { 
    name = n;
    engScore = e;
    mathScore = m;
  }

  void setScore(int e, int m){
    engScore = e;
    mathScore = m;
  }

  void display(){
    System.out.println(name + "さん");
    System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
  }
}

class StuSample2 {
  public static void main(String[] args){
    Student2 stu1 = new Student2();
    Student2 stu2 = new Student2();
     stu1.setData("田中");
     stu1.setScore(90, 80);
     stu1.display();

     stu2.setData("佐藤", 75, 100);
     stu2.display();
  }
}

//クラス内に同じ名前で引数の型や数が違うメソッドを複数定義することをオーバーロードという
//呼び出すメソッドは名前と引数の組み合わせで決めている
