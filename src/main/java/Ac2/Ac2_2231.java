package Ac2;
//브루트포스
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ac2_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 0; i < n; i++){
            int number = i;
            int sum = 0;

            while (number != 0){
                sum += number % 10; //각 자릿수 더하기
                number /= 10;
            }

            if(sum + i == n){ //생성자 찾기
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
