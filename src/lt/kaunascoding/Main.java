package lt.kaunascoding;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iveskite skaiciu, kuri pakelsime kvadratu");
        Scanner sc = new Scanner(System.in);
        int ivestasSkaicius = sc.nextInt();
        System.out.println("Skaiciaus kvadratas: " + kvadratu(ivestasSkaicius));
    }

    private static int kvadratu(int parametras) {
        return parametras * parametras;
    }
}