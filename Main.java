class Car2{
  int no;
  int speed ;

  Car2(){
    no = 0;
  }

  Car2(int n){
   no = n;
  }

  void run(int s){
    speed = s;
  }
  
  void brake(){
    speed = 0;
  }

  void brake(int s){
    speed = speed - s;
  }

  void display(){
    System.out.println("ナンバー" + no + "の速度は" + speed + "です");
  }
}

class Drivecar2 {
  public static void main(String[] args){
    Car2 c1 = new Car2();
    c1.run(30);
    c1.display();

    Car2 c2 = new Car2(2525);
    c2.run(50);
    c2.display();
  }
}