class Main {
   public static void main(String[] args){
    int radius = Integer.parseInt(args[0]);
    double pi = 3.141592;
    double area;

    area = radius * radius * pi;

    area = (int)(area * 100); //小数点第3位以降を切り捨て
    area = area / 100; //小数点を/100で戻す

    System.out.println("半径：" + radius);
    System.out.println("面積：" + area);
  }
}