 class Car1 {
  private int no;

  public Car1(int no) {
    this.no = no;
  }

  public void display() {
    System.out.println("ナンバーは" + no + "です");
  }
}

 class Taxi1 extends Car1 {
  private int price;

  public Taxi1(int no){
    this(no, 0);
  }

  public Taxi1(int no, int price){
    super(no);
    this.price = price;
  }

  public void start() {
    price = 420;
  }

  public void run(){
    price = price + 80;
  }

  public void display() {
    super.display();
    System.out.println("料金は" + price + "円");
  }
}

class Drive1 {
  public static void main(String[] args){
    Taxi1 t1 = new Taxi1(2525);
    t1.start();
    t1.run();
    t1.display();
  }
}