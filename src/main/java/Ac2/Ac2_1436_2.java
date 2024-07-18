package Ac2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ac2_1436_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n > 1){
            func(n);
        }else {
            System.out.println(666);
        }
    }

    // 자릿수에 따라서 num은 0 또는 600, 660, 666을 갖는다.
    public static void func(int n){
        int cnt = 1;
        int prev_digit = 0; // 선수 자릿수
        int num = 0; // 선수 자릿수를 제외한 나머지 뒷 자릿수

        while (true){

            // 선수 자릿수가 x...666x이면서 x...6666이 아닐 경우 (ex. 6660_000, 6660_001, ...)
            if (((prev_digit % 10000) / 10) == 666 && prev_digit % 10 != 6){
                for (int i=0; i<1000;i++){
                    if(cnt == n){
                        System.out.print(prev_digit * 1000 + num);
                        return;
                    }
                    num++;
                    cnt++;
                }
                prev_digit++;
            }

            //선수 자릿수가 x...666 일 경우 (ex. 666_000, 1666_004, ...)
            else if (prev_digit % 1000 == 666) {
                num = 0;
                for (int i=0;i<1000;i++){
                    if (cnt == n){
                        System.out.print(prev_digit * 1000 + num);
                        return;
                    }
                    cnt++;
                    num++;
                }
                prev_digit++;
            }

            //선수 자릿수가 x...66 일 경우 (ex. 66_600, 166_600, ...)
            else if (prev_digit % 100 == 66) {
                num = 600;
                for (int i = 0;i<100;i++){
                    if (cnt == n){
                        System.out.print(prev_digit * 1000 + num);
                        return;
                    }
                    cnt++;
                    num++;
                }
                prev_digit++;
            }

            //선수 자릿수가 x...6 일 경우 (ex. 6_660, 16_663, ...)
            else if (prev_digit % 10 == 6){
                num = 660;
                for (int i = 0;i<10;i++){
                    if (cnt == n){
                        System.out.print(prev_digit * 1000 + num);
                        return;
                    }
                    num++;
                    cnt++;
                }
                prev_digit++;
            }

            //그 외의 경우 (ex. 241_666, 23_666 ...)
            else {
                num = 666;
                if (cnt == n){
                    System.out.print(prev_digit * 1000 + num);
                    return;
                }
                cnt++;
                prev_digit++;
            }
        }
    }
}
