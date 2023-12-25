class Student4 {
  String name;
  static int counter = 0;

  Student4(String n){
    name = n;
    counter++;
    System.out.println(name + "さんをインスタンス化しました");
  }

  static void display(){
    System.out.println(counter + "人です");
  }
}

class StuSample4 {
  public static void main(String[] args){
    Student4.display();

    Student4 stu1 = new Student4("田中");
    Student4.display();
    Student4 stu2 = new Student4("佐藤");
    Student4.display();
  }
}

//作ったインスタンスの個数を知るにはインスタンス内の変数では不可能
//全インスタンスが共通して使える変数が必要→staticを指定する
//オブジェクトを生成していなくても使える→クラス名.変数[メソッド]名と記述