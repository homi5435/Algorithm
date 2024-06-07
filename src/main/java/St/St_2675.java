package St;

import java.io.*;
import java.util.StringTokenizer;

public class St_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i=0;i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            String[] arr = new String[s.length()];

            for (int j=0;j<s.length();j++){
                arr[j] = String.valueOf(s.charAt(j));
                bw.write(arr[j].repeat(r));
            }
            bw.write("\n");
        }
        bw.close();
        br.close();
    }
}
