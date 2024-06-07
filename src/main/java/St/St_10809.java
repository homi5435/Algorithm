package St;
//a = 97, z = 122
import java.io.*;
import java.util.Arrays;

public class St_10809 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] al = new int[26];
        Arrays.fill(al, -1);

//        for (int i=0;i<s.length();i++){
//            int num = s.charAt(i);
//            int j = 97;
//            while(j < 123){
//                if (num == j) al[j-97] = i;
//                j++;
//            }
//        }
        for (int i=0;i<s.length();i++){
            int num = s.charAt(i);
            if(al[num-97] == -1)
                al[num-97] = i;
        }
        for (int k : al){
            bw.write(k + " ");
        }
        bw.close();
        br.close();
    }
}
