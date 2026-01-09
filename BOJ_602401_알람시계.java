
import java.util.Scanner;

public class BOJ_602401_알람시계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if(minute < 45) {
            minute = 60 + (minute - 45);
            hour--;

            if(hour < 0) {
                hour = 23;
            }
        }

        else {
            minute = minute - 45;
        }

        System.out.println(hour + " " + minute);
    }

}

