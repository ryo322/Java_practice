import java.io.*;

public class practice {
    public static void main( String[] args ) throws IOException {
        //2-1
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        String  s = br.readLine();
        System.out.println( s );
        //2-2
        int a = Integer.parseInt( br.readLine() );
        System.out.println( a );
        //2-3
        int b = Integer.parseInt( br.readLine() );
        System.out.println( b );
        System.out.println( b * b );
        System.out.println( b * b * b );
        //2-4
        int c = Integer.parseInt( br.readLine() );
        int d = Integer.parseInt( br.readLine() );

        System.out.println("和 " + ( c + d ) );
        System.out.println("差 " + ( c - d ) );
        System.out.println("積 " + ( c * d ) );
        System.out.println("商 " + ( c / d ) );
        System.out.println("余り " + ( c % d ) );
        //2-5
        int e = Integer.parseInt( br.readLine() );
        int f = Integer.parseInt( br.readLine() );

        System.out.println( "平均値=" + ( ( e + f ) / 2 ) );
        //2-6
        System.out.println( "あなたの年齢は？" );
        int age = Integer.parseInt( br.readLine() );

        System.out.println( "生まれてから今まで、およそ " + ( age * 365 ) + "日です" );
    }
}
