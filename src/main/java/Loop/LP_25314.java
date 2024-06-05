package Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LP_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int j = n / 4;
        StringBuilder data = new StringBuilder("int");
        for (int i=0; i < j; i++){
            data.insert(0,"long ");
        }
        System.out.println(data);
    }
}
