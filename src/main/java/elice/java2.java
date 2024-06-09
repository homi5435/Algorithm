package elice;

import java.util.*;


public class java2 {
    public static String convertBinary(int n) {
        if(n == 0 || n == 1){
            return String.valueOf(n);
        }
        return convertBinary(n/2) + (n%2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(convertBinary(n));
    }
}
