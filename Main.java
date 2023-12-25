class Student {
  //メンバ変数（属性）
  String name;
  int engScore;
  int mathScore;

  //メソッド（操作）
  void display() { //戻り値を返さない場合は戻り値の型にvoidを記述
    System.out.println(name + "さん");
    System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
  }

  void setScore(int eng, int math){
    engScore = eng;
    mathScore = math;
  }

  double getAvg(){
    double avg = (engScore + mathScore) / 2.0; //2だとint型になるので2.0にする
    return avg; //戻り値を返す場合はreturnを記述
  }
}

class Stusample {
  public static void main(String[] args){
    Student stu1 = new Student();
     stu1.name = "田中";
     stu1.setScore(90, 80);

     stu1.display();
     System.out.println("平均" + stu1.getAvg() + "点");
  }
}