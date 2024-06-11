package Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math1_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int t = Integer.parseInt(st.nextToken());

        int sum = 0;
        int temp = 1;

        for (int i = n.length()-1; i >= 0; i--){
            char c = n.charAt(i);

            if('A' <= c && c <= 'Z'){
                sum += (c - 'A' + 10) * temp;
            } else {
                sum += (c - '0') * temp;
            }
            temp *= t;
        }

        System.out.println(sum);

    }
}
