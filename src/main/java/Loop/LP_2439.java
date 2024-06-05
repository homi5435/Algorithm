package Loop;

import java.io.*;

public class LP_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            for (int j=n;j>i+1;j--){
                bw.write(" ");
            }
            for (int l=0;l<i+1;l++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.close();
        br.close();
    }
}
