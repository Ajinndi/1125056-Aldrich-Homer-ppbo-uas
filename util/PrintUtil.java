package util;

import java.util.*;

import model.keyValueDetailable;

public class PrintUtil extends GObjectForm implements keyValueDetailable {
    private static Scanner sc = new Scanner(System.in);

    public static int readInt(String message) {
        System.out.print(message);
        return Integer.parseInt(sc.nextLine());
    }

    public static String readLine(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    @Override
    public static void printGObjectDetail() {}
}