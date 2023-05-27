package Chapter_01;

import java.util.Scanner;

public class _10_UpdownGame {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100 + 1);  //랜덤값
        int input = 0; //입력값
        int trynum = 0; //시행횟수
        int min = 1;
        int max = 100;
        String gameover="n";
        Scanner scanner = new Scanner(System.in);
        System.out.println(random);

        System.out.println("************업다운 게임********\n\n");
        System.out.println("컴퓨터는 숫자를 결정했습니다.");
        System.out.println("시작 하겠습니다.\n");
        while (input != random) {
            trynum++;
            System.out.println(min + "부터" + max + "사이의 숫자를 입력하세요.");
            input = scanner.nextInt();
            if (input < random) {
                System.out.println("업!!!");
                min = input + 1;
            } else if (input > random) {
                max = input - 1;
                System.out.println("다운!!!");
            } else {
                System.out.println("축하합니다. 정답입니다.");
                System.out.println("축하합니다" + trynum + "번째 맞췄습니다.\n");
                System.out.println("게임을 종료 하시겠습니까?(y/n)");
                gameover = scanner.next();
            }
        }
                switch (gameover){
                    case "y":
                        System.out.println("게임을 종료합니다.");
                break;
                     case "n":

                         random = (int) (Math.random() * 100 + 1);
                         input = 0;
                         trynum = 0;
                         min = 1;
                         max = 100;

                         System.out.println(random);

                         while (input != random) {

                             trynum++;

                             System.out.println(min + "부터" + max + "사이의 숫자를 입력하세요.");

                             input = scanner.nextInt();

                             if (input < random) {
                                 System.out.println("업!!!");
                                 min = input + 1;
                             } else if (input > random) {
                                 max = input - 1;

                                 System.out.println("다운!!!");
                             }


                             else {
                                 System.out.println("축하합니다. 정답입니다.");
                                 System.out.println("축하합니다" + trynum + "번째 맞췄습니다.\n");
                                 System.out.println("게임을 종료 하시겠습니까?(y/n)");
                                 gameover = scanner.next();}}






        }





    }}
