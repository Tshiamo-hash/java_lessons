import java.util.Scanner;

public class DoubleConversion{
 public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);
  String number;

  System.out.println("Please enter your double value here");
  number = scanner.nextLine();

  double doubleValue = Double.parseDouble(number);
  System.out.println("The changed string number is " + doubleValue);
 }
}