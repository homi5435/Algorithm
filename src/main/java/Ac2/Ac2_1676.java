package Ac2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ac2_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while(n >= 5){
            cnt += n / 5;
            n /= 5;
        }

        System.out.println(cnt);
        //처음에는 factorial 값을 구하고 뒤부터 0의 갯수를 세려고 했으나, 입력 최대값이 500이면 BigInteger 클래스를 사용
        //물론 사용하면 되지만 팩토리얼 값의 마지막에 0이 나오기 위해서 2, 5가 필요하다는 규칙을 생각해 5의 n승을 구하기 위해
        //반복문을 통해 5로 나누면서 누적합을 구해줌
    }
}
