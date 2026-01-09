
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int max = 0;
        ArrayList<Integer> numLine = new ArrayList<Integer>(9);

        for (int i = 0; i < 9; i++) {
            numLine.add(sc.nextInt());
        }
        for (int i = 0; i < 9; i++){
            if (numLine.get(i) > max) max = numLine.get(i);{
            }
        }
        System.out.println(max);
        for (int i = 0; i < 9; i++){
            if (max == numLine.get(i) ){
                System.out.println(i+1);
            }
        }

    }
}
