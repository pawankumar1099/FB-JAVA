import java.util.HashSet;
import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder("");
        HashSet<Character> set = new HashSet<>();

        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122)){
                set.add(s.charAt(i));
            }
        }
        
        for(Character ch:set){
            sb.append(ch);
        }

        
    }
}
