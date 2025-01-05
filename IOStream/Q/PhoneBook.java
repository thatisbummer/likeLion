package likeLionTestQ.IOStream.Q;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {
    String filePath = "src/likeLIONTESTQ/phone.txt";

    class Contact{
        private String name;
        private String phoneNumber;

        public Contact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "name='" + name + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    '}';
        }
    }

    public List<Contact> addContact(int allContact) {
        Scanner sc = new Scanner(System.in);
        List<Contact> contacts = new ArrayList<>();

        for (int i = 0; i < allContact; i++) {
            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("번호: ");
            String phoneNumber = sc.nextLine();
            contacts.add(new Contact(name,phoneNumber));

        }
        return contacts;
    }

    public void saveContact(List<Contact> contacts) {
        try(PrintWriter printWriter = new PrintWriter(new FileOutputStream(filePath))) {
            for (Contact contact : contacts) {
                printWriter.println(contact);
            }
            System.out.println("전화번호가 " + filePath + "저장되었습니다.");
        } catch (FileNotFoundException e) {
            System.out.println("파일에 저장중 오류가 발생함" + e.getMessage());
        } ;
    }

    public void readFile() {
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("파일이 존재하지 않습니다.");
            return;
        }
        System.out.println(filePath + "의 내용은 다음과 같습니다.");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (Exception e) {
            System.out.println("파일을 읽는 중 오류" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        int a = 3;

        List<Contact> contacts = phoneBook.addContact(a);
        phoneBook.saveContact(contacts); //담은걸 저장해야함
        phoneBook.readFile();






    }
}
