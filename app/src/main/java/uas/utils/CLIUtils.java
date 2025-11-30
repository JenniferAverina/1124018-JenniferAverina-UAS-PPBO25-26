package utils;

import java.util.Scanner;

public class CLIUtils {
  private static Scanner scanner;

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
