package Ac2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ac2_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            boolean yn = true;
            String n = br.readLine();
            if(n.equals("0")){
                break;
            }else {
                for (int i=0;i<n.length()/2;i++){
                    if (n.charAt(i) != n.charAt(n.length()-1-i)){
                        yn = false;
                    }
                }
            }
            if (yn){
                System.out.println("yes");
            }else System.out.println("no");
        }
        br.close();

//        while(true){
//            String st = br.readLine();
//            char[] arr = new char[st.length()];
//            for(int i =0; i<arr.length;i++) {
//                arr[i] = st.charAt(i);
//            }
//            if(!st.equals("0")){
//                String rest = "";
//                for (int j=arr.length-1;j>=0;j--){
//                    rest += arr[j];
//                }
//                if (st.equals(rest)){
//                    System.out.println("yes");
//                }else System.out.println("no");
//            }else break;
//        }
    }
}
