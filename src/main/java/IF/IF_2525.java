package IF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IF_2525 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] array = br.readLine().split(" ");
        int h = Integer.parseInt(array[0]);
        int m = Integer.parseInt(array[1]);
        int cm = Integer.parseInt(br.readLine());
        if(h+(cm / 60) < 24 && m+(cm % 60) < 60)
            System.out.println((h+(cm/60)) + " " + (m+(cm%60)));
        else if(h+(cm/60) >= 24 && m+(cm % 60) < 60)
            System.out.println((h+(cm/60)-24)+" "+(m+(cm%60)));
        else if(h+(cm/60) >= 23 && m+(cm%60) >= 60)
            System.out.println((h+(cm/60)-23)+" "+(m+(cm%60)-60));
        else if(h+(cm/60) < 23 && m+(cm%60) >= 60)
            System.out.println((h+(cm/60)+1)+" "+(m+(cm%60)-60));
    }
}
