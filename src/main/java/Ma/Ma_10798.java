package Ma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Ma_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[5][15];
        int max = 0;
        for(int i=0;i<5;i++){
            String st = br.readLine();
            max = Math.max(max, st.length());

            for (int j=0; j<st.length(); j++){
                arr[i][j] = String.valueOf(st.charAt(j));
            }
        }

        for (int i=0;i<max;i++){
            for (int j=0;j<5;j++){
                if (Objects.equals(arr[j][i], null)) System.out.print("");
                else {
                    System.out.print(arr[j][i]);
                }
            }
        }
    }
}
