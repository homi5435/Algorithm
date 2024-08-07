package Ac2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Ac2_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0;i<n;i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);

        for (int d : list){
            sb.append(d).append('\n');
        }
        System.out.println(sb);
    }
}
