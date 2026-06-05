import java.util.Scanner;

public class l_vending_machine {

    // [요구사항]
    // 사용자 메뉴가 출력
    // 돈 넣기
    // 메뉴선택 시 -> 음료가 나온다, 돈이 차감된다.
    // 종료시 잔돈이 반환된다.


    public static void printMenu(int totalMoney) {
        System.out.println("============================== 자판기 ==============================");
        System.out.println("[1]콜라-500원 [2]사이다-700원 [3]환타-300원 [4]물-200원 [5]돈넣기 [6]종료");
        System.out.println("현재 금액 : " + totalMoney + "원");
        System.out.println("======================================================================");
        if (totalMoney == 500) {
            System.out.println("콜라 나왔습니다.");
        } else if (totalMoney == 700) {
            System.out.println("사이다 나왔습니다.");
        } else if (totalMoney == 300) {
            System.out.println("환타 나왔습니다.");
        } else if (totalMoney == 200) {
            System.out.println("물 나왔습니다.");
        }
    }

    public static void main(String[] args) {
        int totalMoney = 0;



        System.out.print("금액을 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        printMenu(price);
    }
}
