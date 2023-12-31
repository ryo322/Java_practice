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
        
    }
}
