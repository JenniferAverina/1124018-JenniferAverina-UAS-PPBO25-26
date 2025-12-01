package uas.utils;

import java.util.Scanner;

public class CLIUtils {
  private static Scanner sc;

  static {
    sc = new Scanner(System.in);
  }

  public static int getInt() {
    return sc.nextInt();
  }

  public static String getString() {
    return sc.nextLine();
  }

  public static int askForInt(String message) {
    System.out.println(message);
    return sc.nextInt();
  }

  public static String askForString(String message) {
    System.out.println(message);
    return sc.nextLine();
  }

}
