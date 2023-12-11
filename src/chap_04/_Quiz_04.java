package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {

        int hour = 10; // 주차시간
        boolean isSamllCar = false; // 경차 여부
        boolean withDisabledPerson = true; // 장애인 차량 여부
        int fee = hour * 4000; // 시간당 4000 원 곱하기

        // 30000원 초과 시 일일 최대 요금으로 수정

        if (fee > 30000){
            fee = 30000;
        }

        // 경차 또는 장애인 차량인 경우 50% 할인
        if(isSamllCar || withDisabledPerson == true){
            fee /= 2; // 50% 할인 적용
        }

        System.out.println("주차 요금은 " + fee + "원 입니다.");
    }
}