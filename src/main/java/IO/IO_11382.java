package IO;
import java.io.*;
import java.util.*;
public class IO_11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        String array[] = s.split(" ");
        Long A = Long.parseLong(array[0]);
        Long B = Long.parseLong(array[1]);
        Long C = Long.parseLong(array[2]);
        System.out.println(A + B + C);
    }
}
