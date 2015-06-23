import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int input = sc.nextInt();
 
        String inStr = Integer.toBinaryString(input);
 
        char[] inArray = inStr.toCharArray();
        int cnt = 0;
        for(char c: inArray){
            if( c == '1') cnt++;
        }
 
        String result = cnt == 1 ? "YES" : "NO";
        System.out.println(result);
 
    }
}