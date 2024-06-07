package St;

import java.io.*;
import java.util.StringTokenizer;

public class St_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb;

        StringTokenizer st = new StringTokenizer(br.readLine());
        String num1 = st.nextToken();
        String num2 = st.nextToken();

        sb = new StringBuilder(num1);
        num1 = sb.reverse().toString();
        sb = new StringBuilder(num2);
        num2 = sb.reverse().toString();

        bw.write(String.valueOf(Math.max(Integer.parseInt(num1),Integer.parseInt(num2))));


//        String[] arr1 = st.nextToken().split("");
//        String[] arr2 = st.nextToken().split("");
//
//        String a = arr1[0];
//        arr1[0] = arr1[2];
//        arr1[2] = a;
//
//        String b = arr2[0];
//        arr2[0] = arr2[2];
//        arr2[2] = b;
//
//        int x = (Integer.parseInt(arr1[0]) * 100)+(Integer.parseInt(arr1[1])*10)+(Integer.parseInt(arr1[2]));
//        int y = (Integer.parseInt(arr2[0]) * 100)+(Integer.parseInt(arr2[1])*10)+(Integer.parseInt(arr2[2]));
//        bw.write(String.valueOf(Math.max(x, y)));

        bw.close();
        br.close();

    }
}
