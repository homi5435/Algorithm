package elice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class day3 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();

        Stack<Character> stack = new Stack<>();
        int[] depthResult = new int[50];
        int depth = 0;

        for (char ch : st.toCharArray()){
            if (ch != ')'){
                if (ch == '('){
                    depth += 1;
                    depthResult[depth] = 0;
                }
                stack.push(ch);
            } else {
                for (int i = stack.size() - 1; i >= 0; i--){
                    if (stack.get(i) == '(') {
                        int num = depthResult[depth];
                        for (int j = i + 1; j < stack.size(); j++) {
                            num += 1;
                        }
                        depth -= 1;
                        depthResult[depth] += num * Character.getNumericValue(stack.get(i - 1));
                        while (stack.size() > i - 1) {
                            stack.pop();
                        }
                        break;
                    }
                }
            }
        }
        System.out.println(depthResult[0] + stack.size());
    }
}

