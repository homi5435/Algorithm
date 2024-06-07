package St;
//A = 65, Z = 90;
import java.io.*;

public class St_5622 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tel = br.readLine();
        int time = 0;

        for (int i=0;i<tel.length();i++){
            int num = tel.charAt(i);
            if (num >= 65 && num <= 67) time += 3;
            else if (num >= 68 && num <= 70) time += 4;
            else if (num >= 71 && num <= 73) time += 5;
            else if (num >= 74 && num <= 76) time += 6;
            else if (num >= 77 && num <= 79) time += 7;
            else if (num >= 80 && num <= 83) time += 8;
            else if (num >= 84 && num <= 86) time += 9;
            else if (num >= 87 && num <= 90) time += 10;
        }
        bw.write(String.valueOf(time));

        bw.close();
        br.close();

    }
}
