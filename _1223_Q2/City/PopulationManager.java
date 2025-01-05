package likeLionTestQ._1223_Q2.City;

import java.util.HashMap;
import java.util.Scanner;

public class PopulationManager {
    HashMap<String, Integer> map = new HashMap<>();

    public void add(String city, int population) { // 추가
        map.put(city,population);
        System.out.println(city + "이(가) 추가 되었습니다 총 인구 수는 " + population + "명 입니다.");
    }

    public void remove(String city) {
        if (map.containsKey(city)) {
            map.remove(city);
            System.out.println(city + "는 삭제되었습니다.");
        } else {
            System.out.println(city + "는 잘못입력하셨거나 없는 도시입니다.");
        }
    }

    public void check(String city) {  // 조회
        if (map.containsKey(city)) {
            System.out.println(map.get(city));
        } else {
            System.out.println("잘못입력하셨거나 없는 도시입니다.");
        }
    }

    public void all() {
        for (String key : map.keySet()) {
            System.out.println("도시이름 : " + key + "인구 수: " + map.get(key));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PopulationManager populationManager = new PopulationManager();

        while(true) {
            System.out.println("도시 인구");
            System.out.println("1.추가");
            System.out.println("2.삭제");
            System.out.println("3.조회");
            System.out.println("4.전부 조회");
            System.out.println("5.종료");
            System.out.print("원하시는 번호를 입력하세요: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("도시이름 : ");
                    String city = sc.nextLine();
                    System.out.print(" 인구 수 : ");
                    int pop = sc.nextInt();
                    populationManager.add(city,pop);
                    break;

                case 2:
                    System.out.print("삭제할 도시 이름을 적어주세요: ");
                    String removeCity = sc.nextLine();
                    populationManager.remove(removeCity);
                    break;

                case 3:
                    System.out.print("검색할 도시: ");
                    String searchCity = sc.nextLine();
                    populationManager.check(searchCity);
                    break;

                case 4:
                    System.out.println("저장된 모든 도시 출력");
                    populationManager.all();
                    break;

                case 5:
                    System.out.println("exit");
                    return;
                default:
                    System.out.println("잘못입력하셨습니다.");
            }
        }
    }
}
