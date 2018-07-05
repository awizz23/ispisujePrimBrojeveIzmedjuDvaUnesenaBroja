package primbrojeviizmedjudvaunesenabroja;

import java.util.Scanner;

public class PrimBrojeviIzmedjuDvaUnesenaBroja {

    public static void main(String[] args) {
        int broj1, broj2, brojac;
        boolean primarni = true;
        Scanner input = new Scanner(System.in);

        System.out.print("Unesite prvi broj: ");
        broj1 = input.nextInt();
        System.out.print("Unesite drugi broj: ");
        broj2 = input.nextInt();
        input.close();

        for (int k = broj1; k <= broj2; k++) {
            if (jestPrim(k)) {
                System.out.println(k);
            }
        }
    }

    private static boolean jestPrim(int k) {
        if (k < 2) {
            return false;
        } else {
            for (int i = 2; i < k; i++) {
                if (k % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
