package Dp;
// = 61, - 45
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Dp_2941 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int len = str.length();
        int count = 0;

        for (int i = 0; i < len; i++) {

            char ch = str.charAt(i);

            if(ch == 'c' && i < len - 1) {
                if(str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                    i++;
                }

            }

            else if(ch == 'd' && i < len - 1) {
                if(str.charAt(i + 1) == '-') {
                    i++;
                }
                else if(str.charAt(i + 1) == 'z' && i < len - 2) {

                    if(str.charAt(i + 2) == '=') {
                        i += 2;
                    }
                }
            }

            else if((ch == 'l' || ch == 'n') && i < len - 1) {
                if(str.charAt(i + 1) == 'j') {
                    i++;
                }
            }


            else if((ch == 's' || ch == 'z') && i < len - 1) {
                if(str.charAt(i + 1) == '=') {
                    i++;
                }

            }

            count++;

        }

        System.out.println(count);
    }
}
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int sum = 0;
//        String[] arr = br.readLine().split("");
//        for (int i=0;i<arr.length;i++){
//
//            if(Objects.equals(arr[i],"c") && i < arr.length - 1) {
//                if (Objects.equals(arr[i + 1], "=") || Objects.equals(arr[i + 1], "-")) {
//                    i ++;
//                }
//            }
//
//            if (Objects.equals(arr[i], "d") && i < arr.length - 2) {
//                if (Objects.equals(arr[i + 1],"z") && Objects.equals(arr[i + 2], "=")) {
//                    i +=2;
//                } else if (Objects.equals(arr[i + 1],"-")) {
//                    i++;
//                }
//            }
//
//            if ((Objects.equals(arr[i],"l") || Objects.equals(arr[i], "n")) && i < arr.length - 1) {
//                if (Objects.equals(arr[i + 1], "j")) i++;
//            }
//
//
//            if ((Objects.equals(arr[i], "s") || Objects.equals(arr[i], "z")) && i < arr.length - 1) {
//                if (Objects.equals(arr[i + 1], "=")) i++;
//            }
//            sum++;
//        }
//        System.out.println(sum);
//    }
//
//}
