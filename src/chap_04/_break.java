package chap_04;

public class _break {
    public static void main(String[] args) {
        //반복문 시행하지 않고 탈출해야하는 경우 break
        
        int max = 20;
        for (int i = 0; i <=50 ; i++) {
            System.out.println(i+"번 손님 주문하신 치킨 나옴.");
            if(i == max){
                System.out.println("재료소진");
                break;

            }
            
        }
        System.out.println("영업종료");


        int index = 0;
        while (index <=50){
            System.out.println(index+1 + "번 손님, 주문하신 피자 나왔습니다.");
            index++;
            if(index == max){
                System.out.println("재료 소진!");
                break;
            }

        }

    }
}
