package Dp;
// A = 65
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Dp_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        word = word.toUpperCase();
        int max = -1;
        char ch = '?';
        int[] al = new int[26];

        for (int i=0;i<word.length();i++){
            int a = word.charAt(i);
            al[a-65]++;
        }
        for (int j=0; j<al.length; j++){
            if (al[j] > max){
                max = al[j];
                ch = (char) (j+65);
            }
            else if(al[j] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
