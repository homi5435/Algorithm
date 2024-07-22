package elice;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileOutput {
    public static void main(String[] args) {
        String inputData = "I hate test!";
        String inputFilename = "./Test.txt";

        // 지시 사항에 따라 코드를 입력해 보세요.
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(inputFilename);
            byte[] bytes = inputData.getBytes();

            fos.write(bytes);
            System.out.println("파일에 데이터가 성공적으로 입력되었습니다.");
            System.out.println(inputFilename);
            System.out.println(inputData);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
