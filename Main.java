class Main {
   public static void main(String[] args){
    for(int i = 0; i < args.length; i++){ //宣言したiは宣言したブロック内でしか使えない
      System.out.println(args[i]);
    }
  }
}