package likeLionTestQ.IOStream.Q;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class TextFileManager{
    String filePath;

    public TextFileManager(String filePath) {
        this.filePath = filePath;
    }

    public void writeToFile(List<String> lines) {
         try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                bw.write(line);
                // bw.newLine(); // 줄바꿈 개행임
            }
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
    }

    public List<String> readToFile() {
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}

class UserInputHandler{
    public static List<String> writeToUser() {
        List<String> list = new ArrayList<>();
        try (BufferedReader bs = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("텍스트 입력 (exit): 종료: ");

            while(true) {
                String input = bs.readLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                list.add(input);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}

public class Application {
    public static void main(String[] args) {
        String filePath = "src/test.txt";
        TextFileManager textFileManager = new TextFileManager(filePath);
        UserInputHandler userInputHandler = new UserInputHandler();

        // 2. 사용자 입력 처리
        List<String> userInput = userInputHandler.writeToUser();

        // 3. 입력받은 데이터를 파일에 저장
        textFileManager.writeToFile(userInput);
        System.out.println("사용자 입력이 파일에 저장되었습니다.");

        // 4. 파일에서 데이터 읽기
        List<String> fileContent = textFileManager.readToFile();

        // 5. 파일 내용 출력
        System.out.println("파일에서 읽어온 내용:");
        for (String line : fileContent) {
            System.out.println(line);
        }
    }
}
