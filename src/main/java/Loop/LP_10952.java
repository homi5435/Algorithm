package Loop;

import java.io.*;

public class LP_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x, y;
        while (true){
            String[] array = br.readLine().split(" ");
            x = Integer.parseInt(array[0]);
            y = Integer.parseInt(array[1]);
            if(x==0 & y==0) break;
            else bw.write((x+y)+"\n");
        }
        bw.close();
        br.close();

    }
}
