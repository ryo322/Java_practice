class Student5 {
  private String name;
  private int score ;

  public Student5(String n){
    name = n;
  }

  public void setScore(int s){
    if( 0 <= s && s<= 100){
      score = s;
    } else {
      System.out.println(name + "さんの点数が範囲外です");
      score = 0;
    }
  }

  void display(){
    System.out.println(name + "さん" + score + "点");
  }
}

class StuSample5 {
  public static void main(String[] args){
    Student5 stu1 = new Student5("田中");
    stu1.setScore(80);
    stu1.display();

    Student5 stu2 = new Student5("佐藤");
    stu2.setScore(-50);
    stu2.display();
  }
}

//アクセス修飾子(public,protected,private)でクラス・メンバ変数・メソッドの公開範囲を指定できる
//メンバ変数は隠蔽(private)して、クラスとメソッドは公開(public)する設計方針をカプセル化と呼ぶ
//代入前処理（代入する前に正しい値かをチェックする）、プログラムの修正範囲が狭くなるなどのメリットがある