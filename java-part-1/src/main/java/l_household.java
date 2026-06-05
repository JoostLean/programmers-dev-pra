import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class l_household {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountBook book = new AccountBookImpl();

        while (true) {
            System.out.println();

            System.out.println("=========================================== BUDGET ===========================================");
            System.out.println("[1]addAccount [2]showAccount [3]deleteAll [4]EXIT");
            System.out.println("==============================================================================================");

            int menu;

            while (true) {
                try {
                    System.out.print("Enter your choice: ");
                    menu = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a NUMBER.");
                    System.out.println();
                }
            }

            System.out.println();

            switch (menu) {
                case 1: book.addAccount(); break;
                case 2: book.showAccount(); break;
                case 3: book.deleteAll(); break;
                case 4: System.out.println("EXIT"); return;
                default: System.out.println("WRONG NUMBER");
            }
        }
    }

    private interface AccountBook {
        public void addAccount();
        public void showAccount();
        public void deleteAll();
    }

    private static class AccountBookImpl implements AccountBook {
        int balance;

        @Override
        public void addAccount() {
            Scanner sc = new Scanner(System.in);
            System.out.print("금액을 입력하세요: ");
            balance = Integer.parseInt(sc.nextLine());
            System.out.println("잔고 추가가 완료되었습니다.");
        }

        public void showAccount() {
            System.out.println("현재 잔고는 " + balance + "입니다.");
        }

        @Override
        public void deleteAll() {
            Scanner sc = new Scanner(System.in);
            System.out.println("잔고를 모두 제거하시겠습니까? (제거 : 1, 보류 : 아무키)");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                balance = 0;
            }
        }
    }
}
