import java.util.Scanner;

public class LongConversion{
  public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
    String number;

  System.out.println("Please enter your integer value");
  number = scanner.nextLine();

   long longValue = Long.parseLong(number);

  System.out.println("The changed string number is " + longValue);

  }
}