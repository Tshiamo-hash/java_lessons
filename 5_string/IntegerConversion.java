import java.util.Scanner;

public class IntegerConversion{
  public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
    String number;

  System.out.println("Please enter your integer value");
  number = scanner.nextLine();

  int intValue = Integer.parseInt(number);

  System.out.println("The changed string number is " + intValue);

  }
}