import java.util.Scanner;

public class ByteConversion{
  public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   String number;

  System.out.println("Please enter your byte value here");
  number = scanner.nextLine();

   byte byteValue = Byte.parseByte(number);
  System.out.println("Your changed string number is " + byteValue);
  }
}