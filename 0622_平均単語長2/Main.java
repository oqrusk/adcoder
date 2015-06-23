import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        List<String> words = new ArrayList<String>();
 
        boolean isLast = false;
 
        while (sc.hasNext()){
            String word = sc.next();
 
            //文末が.の場合、文章の終わりと判定と、.の除去をする
            if (word.endsWith(".")) {
                isLast = true;
                word = word.substring(0, word.length()-1);
            }
 
            //複数候補の判定
            if(word.startsWith("{")){
 
                //{と}を除去
                word = word.substring(1, word.length()-1);
 
                String[] option = word.split(",");
 
                int len = 0;
                //最大の文字長を採用する
                for(String s :option){
                    if(len < s.length()) {
                        len = s.length();
                        word = s;
                    }
                }
            }
 
            words.add(word);
 
            if(isLast) break;
        }
 
        float sum = 0;
        for (int i = 0; i< words.size(); i++){
            sum += words.get(i).length();
        }
        System.out.println(sum/words.size());
 
    }
 
 
}