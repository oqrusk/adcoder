import java.util.Scanner;
 
/**
 * Created by YOKURA on 6/20/15.
 */
public class Main {
    static int distance;
    static int range;
    static String tilesStr;
    static char[] tiles;
    static int painted = 0;
    static int blank;
    static int cur = 0;
    static int time = 0;
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        // 整数の入力
        distance = sc.nextInt();
        range = sc.nextInt();
        tilesStr = sc.next();
 
        tiles = tilesStr.toCharArray();
 
        for(char tmp : tiles){
            if (tmp == 'o') painted++;
        }
 
        blank = distance - painted;
 
        while(hasBlank()) {
            //足元を確認する
            if(tiles[cur] == '.'){
                //塗られてなかったら打つ
                paint();
            }else{
                //塗られていたら射程を確認する
                if(isOutOfRengeAllPainted()){
                    //射程外が全て塗られていたら打つ
                    paint();
                } else {
                    //射程外が塗られていなかったら動く
                    move();
                }
            }
 
        }
 
        System.out.println(time);
    }
 
    private static boolean hasBlank(){
        String str = String.valueOf(tiles);
        return str.contains(".");
    }
 
    private static boolean isOutOfRengeAllPainted(){
        //射程外が全てoか確認する
        for(int i = cur + range; i < distance; i++){
            if(tiles[i] == '.') return false;
        }
        return true;
    }
 
    private static void paint(){
        for(int i = cur; i < cur + range; i++){
            if(i < distance) tiles[i] = 'o';
        }
        time++;
    }
 
    private static void move(){
        cur++;
        time++;
    }
 
}