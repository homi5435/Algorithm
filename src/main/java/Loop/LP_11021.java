package Loop;

import java.io.*;

public class LP_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i=1; i<=t; i++){
            String[] array = br.readLine().split(" ");
            bw.write("Case #"+i+": "+(Integer.parseInt(array[0])+Integer.parseInt(array[1]))+"\n");
        }
        bw.close();
    }
}
