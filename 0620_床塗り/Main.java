import java.util.Scanner;
 
/**
 * Created by YOKURA on 6/20/15.
 */
public class Main {
 
    public static void main(String[] args) {
        int takahashi = 0;
        int aoki = 0;
        String winner = "";
 
        Scanner sc = new Scanner(System.in);
 
        // 整数の入力
        int tiles = sc.nextInt();
        int cnt = 0;
        char[] row = new char[tiles];
 
        while(tiles > cnt){
            // 文字列の入力
            String str = sc.next();
            row = str.toCharArray();
 
            for(char a: row) {
                String tile = String.valueOf(a);
                if(tile.equals("R")) {
                    takahashi++;
                } else if(tile.equals("B")){
                    aoki++;
                }
            }
            cnt++;
        }
        sc.close();
 
        if(takahashi == aoki){
            winner = "DRAW";
        }else if(takahashi > aoki){
            winner = "TAKAHASHI";
        }else{
            winner = "AOKI";
        }
 
        // 出力
        System.out.println(winner);
 
    }
 
}