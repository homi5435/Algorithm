package elice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class day5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        int[] partArr = new int[(int)Math.pow(2,n)];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0;i<partArr.length;i++){
            partArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(partArr);
        arr.add(partArr[1]);

        for (int i=2;i< partArr.length;i++){
            boolean t = true;
            for (int j=0;j<arr.size();j++){
                int sum = arr.get(j);
                if (!arr.contains(partArr[i]) && j+1 < arr.size()){
                    for (int k=j+1;k<arr.size();k++){
                        if (sum != partArr[i]){
                            sum += arr.get(k);
                        }else t = false;
                    }
                    if (sum == partArr[i]){
                        t = false;
                    }
                }
            }
            if (t){
                arr.add(partArr[i]);
            }
        }
        arr.forEach(number -> System.out.print(number + " "));
    }
}
