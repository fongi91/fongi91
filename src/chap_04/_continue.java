package chap_04;

public class _continue {
    public static void main(String[] args) {
        //continue
        //노쇼 손님 가정

        int max = 20; // 최대 치킨 판매수
        int sold = 0; // 현재 치킨 판매수량
        int noshow = 17;

        for (int i = 1; i <=50 ; i++) {

            if(i==noshow){
                System.out.println(i+"번 손님 노쇼로 인해 다음손님에게 기회가 넘어갑니다.");
                continue;
            }

            System.out.println(i+"번 손님 주문하신 치킨 나옴.");
            sold++; // 판매처리

            if(sold == max){
                System.out.println("금일 재료 소진");
                break;

            }

        }
        System.out.println("영업종료");
        System.out.println("영업종료");



        int sold1 = 0;
        int index = 1;
        while(index <= 50){

            if(index == noshow){
                System.out.println(index + "번 손님, 노쇼로인해 다음손님에게 기회 넘어감.");
                index++;
                continue;
            }

            System.out.println(index + "번 손님, 주문하신 피자 나왔습니다.");
            sold1++;

            if (sold1 == max){
                System.out.println("금일 재료 소진으로 영업종료");
                break;
            }
            index++;
        }

    }
}
