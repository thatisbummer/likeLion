package likeLionTestQ.ThreadQ;

import java.io.*;
import java.util.Scanner;

class FileReaderTask2 implements Runnable{
    private String filePath;

    public FileReaderTask2(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.print(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class FileWriteTask2 implements Runnable{
    private String filePath;

    public FileWriteTask2(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))){
            System.out.println("데이터를 입력하세요(종료: exit)");
            while (sc.hasNext()) {
                String data = sc.nextLine();
                if (data.equalsIgnoreCase("exit")){
                    break;
                }
                bw.write(data);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

public class FileReadWriteBufferApp {
    public static void main(String[] args) {
        Thread fileReader = new Thread(new FileReaderTask("src/likeLionTestQ/input.txt"));
        Thread fileWriter = new Thread(new FileWriteTask("src/likeLionTestQ/output.txt"));

        fileReader.start();
        fileWriter.start();

    }
}
