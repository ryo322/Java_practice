class Car {
  int no;
  int speed;

  void setNo(int n){
    no = n;
  }

  void run(int s) { 
    speed = s;
  }

  void stop(){
    speed = 0;
  }

  void display(){
    System.out.println("ナンバー" + no + "の速度は" + speed + "です");
  }
}

class Drivecar {
  public static void main(String[] args){
    Car c1 = new Car();
     c1.setNo(2525);
     c1.run(30);
     c1.display();

     c1.stop();
     c1.display();
  }
}