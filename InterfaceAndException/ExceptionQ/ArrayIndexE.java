package likeLionTestQ.InterfaceAndException.ExceptionQ;

import java.util.Scanner;

public class ArrayIndexE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30};

        try{
            int num = sc.nextInt();
            System.out.println(arr[num]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 범위를 확인하세요!");
        }
    }
}
