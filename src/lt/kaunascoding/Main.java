package lt.kaunascoding;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Labas, iveskite skaiciu");
        Scanner sc = new Scanner(System.in);
        int ivestasSkaicius = sc.nextInt();
        System.out.println("Ivestas skaicius: "+ivestasSkaicius);
    }
}
