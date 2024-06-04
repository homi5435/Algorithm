package IF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IF_9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        if (score >= 90) System.out.println("A");
        else if (/*90 > score && */score >= 80) System.out.println("B");
        else if (/*80 > score && */score >= 70) System.out.println("C");
        else if (/*70 > score && */score >= 60) System.out.println("D");
        else System.out.println("F");
    }
}
