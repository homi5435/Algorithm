package St;
// blank = 32, \n = 10
import java.io.*;
import java.util.StringTokenizer;

public class St_1152 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        bw.write(String.valueOf(st.countTokens()));

        bw.close();
    }
}
