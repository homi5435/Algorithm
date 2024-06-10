package Ma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ma_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = -1;
        int row = 0;
        int column = 0;

        int[][] arr = new int[9][9];
        for (int i=0; i<9; i++){
            StringTokenizer stn = new StringTokenizer(br.readLine());
            for (int j=0; j<9; j++){
                arr[i][j] = Integer.parseInt(stn.nextToken());
                if (max < arr[i][j]){
                    max = arr[i][j];
                    row = i+1;
                    column = j+1;
                }
            }
        }
        System.out.print(max + "\n" + row + " " + column);
    }
}
