import java.util.Scanner;

public class CharacterConversion{
  public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   String number;

  System.out.println("Please enter your byte value here");
  number = scanner.nextLine();

   char charValue = String.valueOf(number).chartAt(0);
  System.out.println("Your changed string number is " + charValue);
  }
}
