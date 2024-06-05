package Loop;

import java.io.*;
import java.util.StringTokenizer;

public class LP_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str; //nullPointException
        while ((str=br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            bw.write((x + y) + "\n");
        }
        bw.close();
        br.close();
    }
}
