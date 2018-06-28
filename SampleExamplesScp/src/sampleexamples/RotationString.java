package sampleexamples;

/*Java Program to check if One String Rotation of Another*/
import java.util.Scanner;

/*
 * Java Program to check if one String is rotation of
 * another.
 */
public class RotationString {

  public static void main(String[] args) throws Exception {

    Scanner scnr = new Scanner(System.in);
    System.out.println("Please enter original String");
    String input = scnr.nextLine();

    System.out.println("Please enter rotation of String");
    String rotation = scnr.nextLine();

    if (checkRotatation(input, rotation)) {
      System.out.println(input + " and " + rotation
          + " are rotation of each other");
    } else {
      System.out.println("Sorry, they are not rotation of another");
    }

    scnr.close();
  }

  /**
   * This method check is given strings are rotation of each other
   * @param original
   * @param rotation
   * @return true or false
   */
  public static boolean checkRotatation(String original, String rotation) {
    if (original.length() != rotation.length()) {
      return false;
    }

    String concatenated = original + original;

    if (concatenated.indexOf(rotation) != -1) {
      return true;
    }

    return false;
  }
}


/*Output
Please enter original String
IndiaVsAustralia
Please enter rotation of String
AustraliaVsIndia
Sorry, they are not rotation of another

Please enter original String
IndiaVsEngland
Please enter rotation of String
EnglandIndiaVs
IndiaVsEngland and EnglandIndiaVs are rotation of each other


Read more: http://www.java67.com/2017/07/string-rotation-in-java-write-program.html#ixzz5Dws7COQW*/