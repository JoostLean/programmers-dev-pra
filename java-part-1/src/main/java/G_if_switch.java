import java.util.Arrays;
import java.util.Scanner;
// * 조건문
// 조건식의 연산결과에 따라 실행할 문장이 달라져서 프로그램의 실행흐름을 바꿀 수 있다.

public class G_if_switch {

    // 1) if문
    // if (조건식 참) { 실행 }
    public static void exam1() {
        int score = 90;

        if (score >= 90) {
            // 조건식 참일 때 수행할 내용
            System.out.println("A학점 입니다.");
        }
    }

    // 1-1) if - else
    public static void exam2() {
        int score = 90;

        if (score >= 60) {
            System.out.println("합격입니다.");
        } else {
            System.out.println("불합격입니다.");
        }
    }

    // 1-2) if - else if - else
    public static void exam3() {
        System.out.println("점수를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt(); // 사용자 값을 입력받아주세요.

        if (score >= 90) {
            System.out.println("A학점 입니다.");
        } else if (score >= 80) {
            System.out.println("B학점 입니다.");
        } // C,D학점 복습
        else {
            System.out.println("F학점 입니다.");
        }
    }

    // 1-3) 중첩 if
    public static void exam4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");
        int score = sc.nextInt();

        if (score >= 90) {
            if (score >= 95) {
                System.out.println("A++학점 입니다.");
            }
            System.out.println("A학점 입니다.");
        } else if (score >= 80) {
            System.out.println("B학점 입니다.");
        } // C, D학점 복습
        else {
            System.out.println("F학점 입니다.");
        }
    }

    // 2) switch
    // - switch문의 조건식은 결과값은 결과값이 반드시 정수 또는 문자열이어야 한다.
    // - case문의 값은 정수 상수만 가능하며, 중복되지 않아야 한다.
    public static void exam5() {

        Scanner sc = new Scanner(System.in);
        System.out.println("음료수 번호를 누르세요");
        System.out.println("[1]콜라 [2]사이다 [3]환타 [4]물");
        int menuNum = sc.nextInt();

        switch (menuNum) {
            case 1:
                System.out.println("주문하신 콜라가 나왔습니다.");
                break;
            case 2:
                System.out.println("주문하신 사이다가 나왔습니다.");
                break;
            case 3:
                System.out.println("주문하신 환타가 나왔습니다.");
                break;
            default:
                System.out.println("잘 못 누르셨습니다.");
        }
    }

    // A학점 90점 이상, B학점 80점 이상, C학점 70점 이상, 그외 F학점
    // 점수에 맞는 학점을 출력하는 기능을 만들어주세요.
    // switch ~ case ~ default
    public static char getGrade(int score) {
        char grade = 'F';
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        }

        return grade;
    }
    public static void practice1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("학점을 입력하세요 : ");
        int score = sc.nextInt();

        switch (getGrade(score)) {
            case 'A':
                System.out.println("A학점입니다.");
                break;
            case 'B':
                System.out.println("B학점입니다.");
                break;
            case 'C':
                System.out.println("C학점입니다.");
                break;
            default:
                System.out.println("F학점입니다.");
                break;
        }
    }

    public static void exam6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~12월 중 하나를 입력하세요.");
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("1분기입니다.");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("2분기입니다.");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("3분기입니다.");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("4분기입니다.");
                break;
        }
    }

    // [요구사항]
    // 돈 넣기
    // 메뉴선택 시 -> 음료가 나온다, 돈이 차감된다.
    // 종료시 잔돈이 반환된다.

    static final int COKE = 500, CIDER = 500, FANTA = 300, WATER = 200;

    // 사용자 메뉴가 출력 -> 현재 잔금도 표시
    public static void printMenu(int totalMoney) {
        System.out.println("========== 자판기 ==========");
        System.out.println("[1]콜라 : 500, [2]사이다 : 500, [3]환타 : 300, [4]물 : 200, [5]돈 넣기, [6]종료");
        System.out.println("현재 금액 : " + totalMoney);
        System.out.println("===========================");
    }

    // 사용자로부터 메뉴 번호를 받는 함수
    public static int getChoice() {
        // 내용완성
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 메뉴를 선택하시오.");
        return sc.nextInt();
    }

    // 사용자한테 돈받기
    public static int getMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("돈을 넣으시오.");
        return sc.nextInt();
    }

    // calcMoney 완성해주세요
    public static int calcMoney(int totalMoney, int price) {
        return totalMoney - price;
    }

    // 예외
    public static void calcMoneyException() {
        System.out.println("잔돈이 부족합니다.");
    }

    public static void main(String[] args) {

        int totalMoney = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("돈을 넣으세요.");
        totalMoney += sc.nextInt();

        while ( true ) {
            printMenu(totalMoney);
            // 사용자 주문번호
            int choice = getChoice();
            int result = -1;
            switch (choice) {
                case 1:
                    result = calcMoney(totalMoney, COKE);
                    if ( result < 0 ) {
                        System.out.println("잔돈이 부족합니다.");
                    } else {
                        totalMoney = result;
                        System.out.println("콜라가 나왔습니다.");
                    }
                    break;
                case 2:
                    result = calcMoney(totalMoney, COKE);
                    if ( result < 0 ) {
                        System.out.println("잔돈이 부족합니다.");
                    } else {
                        totalMoney = result;
                        System.out.println("사이다 나왔습니다.");
                    }
                    break;
                case 3:
                    result = calcMoney(totalMoney, COKE);
                    if ( result < 0 ) {
                        System.out.println("잔돈이 부족합니다.");
                    } else {
                        totalMoney = result;
                        System.out.println("환타 나왔습니다.");
                    }
                    break;
                case 4:
                    System.out.println("물 나왔습니다.");
                    break;
                case 5:
                    totalMoney += getMoney();
                    break;
                case 6:
                    System.out.println("\n잔돈 " + totalMoney + "원이 반환되었습니다.");
                    return;
                default:
                    System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
}
