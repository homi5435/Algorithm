package elice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class day1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] arr = Integer.toString(n).toCharArray();

        int i = arr.length - 2;
        while(i >= 0 && arr[i] >= arr[i+1]){
            i--;
        }
        int j = arr.length - 1;
        while(arr[j] <= arr[i]){
            j--;
        }

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        Arrays.sort(arr, i + 1, arr.length);
        System.out.println(Integer.parseInt(new String(arr)));
    }
}
