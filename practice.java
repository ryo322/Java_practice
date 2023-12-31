import java.io.*;

public class practice {
    public static void main( String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
        
        //4-1
        for( int i = 0 ; i < 10 ; i++ )
        System.out.print( "SPAM" );
        //4-2
        for( int i = 1 ; i <= 9 ; i++ )
        System.out.print( ( 3 * i ) + " " );
        //4-3
        for( int n = 1, x = 2 ; n <= 8 ; n++, x *= 2 )
        System.out.println( "2の" + n + "乗=" + x );
        //4-4
        int x = 1;

        for( int i = 2 ; i <= 7 ; i++ )
            x *= i;

        System.out.println( x );
        //4-5
        int sum = 0;

        for( int i = 0 ; i < 10 ; i++ ) {
            int value = Integer.parseInt( br.readLine() );
            sum += value;
        }

        System.out.println( "平均は" + ( sum / 10 ) );
        //4-6
        int wins = 0;

        for( int i = 0 ; i < 10 ; i++ ) {
            int result = Integer.parseInt( br.readLine() );

            if( result == 1 )
             wins += 1;
        }

        System.out.println( "勝ち" + wins + "回、負け" + ( 10 - wins ) + "回" );
        //4-7
        int giants = 0;
        int tigers = 0;

        for( int game = 1 ; game <= 9 ; game++ ) {
            System.out.print( game + "回表、巨人の得点は？" );
            giants += Integer.parseInt( br.readLine() );

            System.out.print( game + "回裏、阪神の得点は？" );
            tigers += Integer.parseInt( br.readLine() );
        }

        System.out.println( "巨人：" + giants + "点, 阪神：" + tigers + "点" );

        if( giants > tigers )
            System.out.println( "巨人の勝ち" );
        else if( giants < tigers )
            System.out.println( "阪神の勝ち" );
        else
            System.out.println( "引き分け" );
        //4-8
        int max_value = 0;

        for( int i = 0 ; i < 10 ; i++ ) {
            int value = Integer.parseInt( br.readLine() );

            if( value > max_value )
             max_value = value;
        }

        System.out.println( "最大値=" + max_value );
        //4-9
        int max_value = 0, min_value = 0;

        for( int i = 0 ; i < 10 ; i++ ) {
            int value = Integer.parseInt( br.readLine() );

            if( i == 0 ) {
                max_value = value;
                min_value = value;
             } else {
                if( value > max_value )
                    max_value = value;

                 if( value < min_value )
                    min_value = value;
            }
        }

        System.out.println( "最大値=" + max_value + " 最小値=" + min_value );
        //4-10
        int count = Integer.parseInt( br.readLine() );

        for( int i = 0 ; i < count ; i++ )
            System.out.print( "*" );
        //4-11
        int count = Integer.parseInt( br.readLine() );

        for( int i = 0, out = 0 ; i < count ; i++ ) {
            System.out.print( out++ );

            if( out > 9 )
             out = 0;
        }
        //4-12
        int sum = 0;

        while( sum <= 100 )
            sum += Integer.parseInt( br.readLine() );

        System.out.println( "合計は " + sum );
        //4-13
        int strike = 0;
        int ball = 0;

        while( strike < 3 && ball < 4 ) {
            System.out.print( "ストライク=1 or ボール=2 ？" );

            int judge = Integer.parseInt( br.readLine() );

            if( judge == 1 )
                strike++;
            else if( judge == 2 )
                ball++;
        }

        System.out.println( ball + "ボール," + strike + "ストライク" );
        //4-14
        int strike = 0;
        int ball = 0;

        while( strike < 3 && ball < 4 ) {
            System.out.print( "ストライク=1 or ボール=2 or ファウル=3？" );

            int judge = Integer.parseInt( br.readLine() );

            if( judge == 1 )
                strike++;
            else if( judge == 2 )
                ball++;
            else if( judge == 3 && strike < 2 )
                strike++;
        }

        System.out.println( ball + "ボール," + strike + "ストライク" );
        //4-15
        int value = Integer.parseInt( br.readLine() );
        int n;

        for( n = 2 ; n <= ( value / 2 ) ; n++ ){
            if( ( value % n ) == 0 )
             break;
        }

        if( n > ( value / 2 ) )
            System.out.println( value + "は素数です" );
        else
            System.out.println( value + "は素数ではありません" );
        //4-16
        int n = Integer.parseInt( br.readLine() );

        for( int x = 2 ; n > 1 ; x++ ){
            while( ( n % x ) == 0 ){
                System.out.print( x + " " );
                n /= x;
            }
        }
        //4-17
        for( int p = 1 ; p <= 9 ; p++ ) {
            for( int q = 1 ; q <= 9 ; q++ )
                System.out.printf(" %2d", p * q );

         System.out.println();
        }
        //4-18
        int sum = 0;

        for( ; ; ) {
            int value = Integer.parseInt( br.readLine() );

         if( value == 0 )
             break;

            sum += value;
        }

        System.out.println( "合計は" + sum );
        //4-19
        int sum = 0;
        int count = 0;

        for( ; ; ) {
            int value = Integer.parseInt( br.readLine() );

            if( value == 0 )
             break;

            sum += value;
            count++;
        }

        System.out.println( "平均は" + ( sum / count ) );
        //4-20
        int size = Integer.parseInt( br.readLine() );

        for( int i = 0 ; i < size ; i++ ) {
            for( int j = 0 ; j <= i ; j++ )
            System.out.print( "$" );

            System.out.println();
        }
        //4-21
        int size = Integer.parseInt( br.readLine() );

        for( int i = 0 ; i < size ; i++ ) {
            for( int j = 0 ; j < size ; j++ ) {
                if( i == j || ( size - i - 1 ) == j )
                    System.out.print( "X" );
                else
                    System.out.print( " " );
            }

            System.out.println( "" );
        }
        //4-22
        int     n1 = 0;
        int     n2 = 1;
        int     n3 = n1 + n2;

        while( n1 <= 1000 ) {
            System.out.print( n1 + "," );

            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }   
    }
}
