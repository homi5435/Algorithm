package St;

import java.io.*;

public class St_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split("");
        int sum = 0;

        for (String s : arr) {
            sum += Integer.parseInt(s);
        }

        bw.write(String.valueOf(sum));
        bw.close();
        br.close();
    }
}
