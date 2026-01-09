package ch04;

import java.util.Scanner;

public class Star5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int F = sc.nextInt();
        int S = sc.nextInt();
        int T = sc.nextInt();

        System.out.println(F+S-T);

        if(S < 10){
            F *=10;
        } else if (S < 100) {
            F *=100;

        }else if (S < 1000) {
            F *=1000;
        } else{
            F *=10000;
        }
        // 문자열로 바꿔도 되지만 흔할거 같아서 S의 크기에 따라서 F 값에 변화를주고 그냥 더해버렸습니다

        System.out.println(F+S-T);
    }
}
