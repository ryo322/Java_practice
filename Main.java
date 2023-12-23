class Main {
   public static void main(String[] args){
    int num = Integer.parseInt(args[0]);
    switch (num){
      case 1: //セミコロンではなくコロン
       System.out.println("入園料金8400円");
       break;  //break;で処理を抜ける
      case 2:
       System.out.println("入園料金7000円");
       break;
      case 3:
       System.out.println("入園料金5000円");
       break;
      default: //if文におけるelseのようなもの
      System.out.println("１：一般、２：中・高校生、３：小学生・幼児");
    }
   }
}