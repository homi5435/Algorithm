package St;

import java.io.*;

public class St_11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;


        while((str=br.readLine())!=null) {
            System.out.println(str);
        }
        br.close();
    }
}
//using BufferedWriter
//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//      String input = "";
//      while((input = br.readLine()) != null) {
//          bw.write(input);
//          bw.newLine();
//       }
//      bw.flush();
//      bw.close();
//    }
//}