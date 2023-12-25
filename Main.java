class Student3 {
  String name;
  int engScore;
  int mathScore;

  Student3(String n){
    name = n;
  }

  Student3(String n, int e, int m) { 
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

class StuSample3 {
  public static void main(String[] args){
    Student3 stu1 = new Student3("田中");
    Student3 stu2 = new Student3("佐藤", 75, 100);
     stu1.setScore(90, 80);
     stu1.display();
     stu2.display();
  }
}

//オブジェクトの初期化のために使われる特殊なメソッドをコンストラクタと呼ぶ
//名前はクラス名と同じ、戻り値を持たない、new クラス名（コンストラクタへの因数）で定義
//コンストラクタを定義していない場合は、自動でデフォルトコンストラクタ（引数・処理なし）が生成