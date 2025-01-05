package likeLionTestQ.ThreadQ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileReaderTask implements Runnable{
    private String filePath;

    public FileReaderTask(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try (FileReader fr = new FileReader(filePath)){
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char)data);
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class FileWriteTask implements Runnable{
    private String filePath;

    public FileWriteTask(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("데이터를 입력해주세요(exit을 입력시 종료): ");
        try (FileWriter fw = new FileWriter(filePath)){
            while (sc.hasNext()) {
                String data = sc.nextLine();
                if (data.equalsIgnoreCase("exit")) {
                    break;
                }
                fw.write(data);
                fw.write(System.lineSeparator());
                fw.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

public class FileReadWriteApp {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new FileReaderTask("src/likeLionTestQ/input.txt"));
        Thread thread2 = new Thread(new FileWriteTask("src/likeLionTestQ/output.txt"));

        thread1.start();
        thread2.start();

    }
}
