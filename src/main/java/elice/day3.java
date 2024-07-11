package elice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day3 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();

        int len = plength(st, 0, st.length());
        System.out.println(len);
        }
    private static int plength(String s, int start, int end) {
        int pdlength = 0;
        int i = start;

        while (i < end) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) { //char값의 숫자인지 문자인지 판독
                int num = c - '0';
                i++;
                int subStart = i + 1;

                int bracketCount = 1;
                int subEnd = subStart;
                while (bracketCount > 0) {
                    subEnd++;
                    if (s.charAt(subEnd) == '(') {
                        bracketCount++;
                    } else if (s.charAt(subEnd) == ')') {
                        bracketCount--;
                    }
                }
                int subLength = plength(s, subStart, subEnd); //재귀적으로 계산
                pdlength += num * subLength;
                i = subEnd;
            } else{
                pdlength++; //숫자가 아닌 문자일 경우 길이를 1 증가
            }
            i++;
        }
        return pdlength;
    }
}

