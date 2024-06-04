package IO;

import java.util.Scanner;

public class IO_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A * (B % 10));
        System.out.println(A * ((B/10)%10));
        System.out.println(A * (B/100));
        System.out.println(A * B);

        for(int k=B; k>0; k/=10){
            System.out.println(A*(k%10));
        }
        System.out.println(A*B);

    }
}
