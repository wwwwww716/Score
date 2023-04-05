import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int countA = 0;
        int countY = 0;
        int countN = 0;

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] splitedValue = str.split(",");

        for (int i =0; i<20; i++) {
            int[] score = new int[20];
            score[i] = Integer.parseInt(splitedValue[i]);

            if (score[i] == 5) {
                countA+=2;
            } else if (score[i] == 4) {
                countA++;
                countY++;
            } else if (score[i] == 3) {
                countY+=2;
            } else if (score[i] == 2) {
                countY++;
                countN++;
            } else if (score[i] == 1) {
                countN+=2;
            }
        }
        System.out.println("A : " + countA);
        System.out.println("Y : " + countY);
        System.out.println("N : " + countN);
    }
}