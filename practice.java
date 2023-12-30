import java.io.*;

public class practice {
    public static void main( String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
        
        //3-1
        int a = Integer.parseInt( br.readLine() );
        int b = Integer.parseInt( br.readLine() );

        if( a > b )
        System.out.println( "aはbより大きい。" );
        //3-2
        int c = Integer.parseInt( br.readLine() );
        int d = Integer.parseInt( br.readLine() );

        if( c > d )
            System.out.println( c );
        else
            System.out.println( d );
        //3-3
        int e = Integer.parseInt( br.readLine() );
        int f = Integer.parseInt( br.readLine() );

        if( e > f )
            System.out.println( "eはfより大きい。" );
        else if( e < f )
            System.out.println( "eはfより小さい。" );
        //3-4
        int g = Integer.parseInt( br.readLine() );
        int h = Integer.parseInt( br.readLine() );

        if( g > h )
            System.out.println( "gはhより大きい。" );
        else if( g < h )
            System.out.println( "gはhより小さい。" );
        else
            System.out.println( "gとhは等しい。" );
        //3-5
        int i = Integer.parseInt( br.readLine() );

        if( ( i % 2 ) == 0 )
            System.out.println( "偶数です。" );
        else
            System.out.println( "奇数です。" );
        //3-6
        int j = Integer.parseInt( br.readLine() );

        if( ( j % 2 ) == 0 ) {
         if( j >= 0 )
            System.out.println( "正の偶数" );
         else
            System.out.println( "負の偶数" );
        } else {
         if( j >= 0 )
            System.out.println( "正の奇数" );
         else
             System.out.println( "負の奇数" );
        }
        //3-7
        int score = Integer.parseInt( br.readLine() );

        if( score >= 80 )
            System.out.println( "優" );
        else if( score >= 70 )
            System.out.println( "良" );
        else if( score >= 60 )
            System.out.println( "可" );
        else
            System.out.println( "不可" );
        //3-8
        int score1 = Integer.parseInt( br.readLine() );
        int score2 = Integer.parseInt( br.readLine() );

        if( score1 >= 60 && score2 >= 60 )
            System.out.println( "合格" );
        else if( ( score1 + score2 ) >= 130 )
            System.out.println( "合格" );
        else if( ( score1 + score2 ) >= 100 && ( score1 >= 90 || score2 >= 90 ) )
            System.out.println( "合格" );
        else
            System.out.println( "不合格" );
        //3-9
        System.out.println( "曜日を選択してください" );
        System.out.print( "0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜" );
        int day = Integer.parseInt( br.readLine() );

        System.out.println( "時間帯を選択してください" );
        System.out.print( "0=午前、1=午後、2=夜間" );
        int zone = Integer.parseInt( br.readLine() );

        boolean bopen = true;

        if( day == 0 )
            bopen = false;
        else if( zone == 0 && ( day == 2 || day == 5 ) )
            bopen = false;
        else if( zone == 1 && day == 6 )
            bopen = false;
        else if( zone == 2 && ( day == 3 || day == 6 ) )
            bopen = false;

        if( bopen )
            System.out.println( "診療しています。" );
        else
            System.out.println( "休診です。" );
        //3-10
        int x = Integer.parseInt( br.readLine() );
        int y = Integer.parseInt( br.readLine() );

        if( x < y && ( x % 2 ) == 0 && ( y % 2 ) == 0 )
            System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );
        if( x == y && x < 0 )
            System.out.println( "xとyは等しく、かつ、負の数である。" );
        if( x < y || ( x % 2 ) == 0 )
            System.out.println( "xはyより小さい、または、xは偶数である。" );
        if( ( x <= 10 || x >= 100 ) && ( y >= 10 && y <= 100 ) )
            System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );
        if( ! ( x < 0 && y < 0 ) )
            System.out.println( "xもyも負の数である、ではない。" );
        //3-11
        System.out.println( "何月ですか？" );
        int month = Integer.parseInt( br.readLine() );

        switch( month ) {
        case 1:
            System.out.println("元日" );
            System.out.println("成人の日");
        case 2:
            System.out.println("建国記念の日");
        case 3:
            System.out.println("春分の日");
        case 4:
            System.out.println("昭和の日");
        case 5:
            System.out.println("憲法記念日");
            System.out.println("みどりの日");
            System.out.println("こどもの日");
        case 6:
        case 7:
            System.out.println("海の日");
        case 8:
        case 9:
            System.out.println("敬老の日");
            System.out.println("秋分の日");
        case 10:
            System.out.println("体育の日");
        case 11:
            System.out.println("文化の日" );
            System.out.println("勤労感謝の日");
        case 12:
            System.out.println("天皇誕生日");
        }
        //3-12
        System.out.println( "お好きな寿司を選んでください" );
        System.out.println( "1:まぐろ 2:えび 3:こはだ 4:あなご 5:いくら" );

        int sushi = Integer.parseInt( br.readLine() );

        switch( sushi ) {
        case 1:
            System.out.println( "何か良いことがあります。" );
            break;
        case 2:
            System.out.println( "驚くほど良いことがあります。" );
            break;
        case 3:
            System.out.println( "ちょっと良いことがあります。" );
            break;
        case 4:
            System.out.println( "とても良いことがあります。" );
            break;
        case 5:
            System.out.println( "そこそこ良いことがあります。" );
            break;
        }
    }
}
