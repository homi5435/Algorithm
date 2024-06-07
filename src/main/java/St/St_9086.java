package St;

import java.io.*;

public class St_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i=0;i<t;i++){
            String S = br.readLine();
            bw.write(S.charAt(0));
            bw.write(S.charAt(S.length()-1));
            bw.write("\n");
        }
        bw.close();
    }
}
