package St;

import java.io.*;

public class St_2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        bw.write(String.valueOf(S.length()));
        bw.close();
    }
}
