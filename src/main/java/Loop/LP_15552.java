package Loop;

import java.io.*;

public class LP_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long t = Long.parseLong(br.readLine());
        for (long i = 0; i<t; i++){
            String[] array = br.readLine().split(" ");
            int x = Integer.parseInt(array[0]);
            int y = Integer.parseInt(array[1]);
            bw.write((x+y)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
