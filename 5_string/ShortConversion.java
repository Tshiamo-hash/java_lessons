import java.util.Scanner;

public class ShortConversion{
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
   String number;

   System.out.println("Please enter your short value here ");
   number = scanner.nextLine();

   short shortValue = Short.parseShort(number);
  System.out.println("The changed string number is " + shortValue);
  }
}