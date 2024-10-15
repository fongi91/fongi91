//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    // 이중반복문

    // 별(*) 로 사각형 만들기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    // 별로 왼쪽 삼각형 만들기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        // 별로 왼쪽 삼각형(아래부분) 만들기
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        // 별로 오른쪽 삼각형 만들기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <4-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 5-i; j >0 ; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            for (int k = 0; k < i-1; k++) {
                System.out.print("*");
            }
            for (int j = 5-i; j >0 ; j--) {
                System.out.print(" ");
            }

            System.out.println();
        }

        for (int i = 0; i <= 5; i++) {

            for (int k = 0; k <=i-1; k++) {
                System.out.print(" ");
            }
            for (int j = 5-i; j >1 ; j--) {
                System.out.print("*");
            }

            for (int j = 5-i; j >0 ; j--) {
                System.out.print("*");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

}
