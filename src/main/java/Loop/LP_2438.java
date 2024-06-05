package Loop;
//apend use StringBuffer class import
import java.io.*;

public class LP_2438 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer("");
        for (int i=0;i<n;i++){
            sb.append("*");
            bw.write(sb + "\n");
        }
        bw.close();
    }
}
