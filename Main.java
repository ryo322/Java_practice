class Main {
   public static void main(String[] args){
    int height = Integer.parseInt(args[0]);
    int width = Integer.parseInt(args[1]);
    int area;

    area = height * width / 2;

    System.out.println("高さ：" + height);
    System.out.println("幅：" + width);
    System.out.println("面積：" + area);
  }
}