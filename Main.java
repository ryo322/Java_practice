import java.io.IOException;

class WriteFile {
  public void open() {
    System.out.println("ファイルを開きます");
  }

  public void write() throws IOException{
    throw new IOException();
  }

  public void close() {
    System.out.println("ファイルを保存して閉じる");
  }
}

class Divide1{
  public static void main(String[] args) {
    WriteFile wf = new WriteFile();
    try {
      wf.open();
      wf.write();
    } catch(IOException e) {
      System.out.println("IOExceptionが発生");
      e.printStackTrace();
    } catch(Exception e) {
      System.out.println("例外が発生しました");
      e.printStackTrace();
    } finally {
      wf.close();
    }
  }
}

//throw 例外オブジェクト：例外を強制的に発生させる
//throws 例外クラス：メソッドがその例外を発生することを宣言する