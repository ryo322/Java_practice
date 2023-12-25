class Car3{
  private int no;
  private int speed ;

  public Car3(){
    no = 0;
  }

  public Car3(int n){
   no = n;
  }

  public void run(int s){
    speed = s;
  }
  
  public void brake(){
    speed = 0;
  }

  public void brake(int s){
    speed = speed - s;
  }

  public void display(){
    System.out.println("ナンバー" + no + "の速度は" + speed + "です");
  }
}

class Drivecar3 {
  public static void main(String[] args){
    Car3 c1 = new Car3();
    c1.run(30);
    c1.display();

    Car3 c2 = new Car3(2525);
    c2.run(50);
    c2.display();
  }
}