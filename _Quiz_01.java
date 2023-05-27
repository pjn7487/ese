package Chapter_01;

public class _Quiz_01 {
    public static void main(String[] args) {

        //퀴즈1 버스 도착정보 출력 프로그램 작성 각 정보는 적절한 자료형 변수에 정의

        //정보 버스번호는 "1234", "상암08"과 같은 형태
        //남은 시간은 분 단위 ex) 3분, 5분
        // 남은 거리는 km단위 ex) 1.5km, 0.5km

        //문자형 자료
        String nationality = "대한민국"; //국적

        String _flight_no_2 = "KE657";
        //실수형 자료
        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        String name;
        name = "주능";
        int hour = 15;


        System.out.println(name + "님, 배송이 시작됩니다." + hour + "시 방문 예정입니다");
        System.out.println(name + "님, 배송이 완료되었습니다.");


        //버스 번호
        String bussNov = "상암08번 버스";
        System.out.println(bussNov);

        //남은 시간
        int time = 3;
        System.out.println("약 "+ time +"후 도착");

        //남은 거리
       // double dit = 1.5; 로 하는게 편함
        String distance = String.valueOf(1.5);
        System.out.println("남은거리"+distance+"km");

        System.out.println(bussNov+"가 약 "+time+"분 후 도착합니다 남은 거리는 " + distance + "km입니다.");
    }
}


