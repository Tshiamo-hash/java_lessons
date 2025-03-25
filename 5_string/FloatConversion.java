import java.util.Scanner;

public class FloatConversion{
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
   String number;
   
  System.out.println("Please enter your float number below");
   number = scanner.nextLine();

   float floatValue = Float.parseFloat(number);
  System.out.println("The changed string number is " + floatValue);

  }
}