package Chapter_01;

import java.sql.SQLOutput;

public class _03_Variables {
    public static void main(String[] args) {

        String name;
        name = "주능";
        int hour = 15;


        System.out.println(name+"님, 배송이 시작됩니다." +hour+"시 방문 예정입니다");
        System.out.println(name+"님, 배송이 완료되었습니다.");


        double score = 90.5;
        char grade = 'A';
        name = "주은";
        System.out.println(name+ "님의 평균 점수는" + score + "점 입니다.");
        System.out.println("학점은 " +grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격 했을까요?" +pass);

        double d = 3.14123123123;
        float  f = 3.14123123123f;  //float 은 뒤에f 소수면
        System.out.println(d);
        System.out.println(f);

        int i = -2100000000;
        long L = 1_000_0_0_0_0_0_0_0_0_0_00L;
        System.out.println(L);



    }
}
