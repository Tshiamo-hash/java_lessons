import java.util.Scanner;

public class BooleanConversion{
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
   String results;

  System.out.println("Please enter your string results below ");
   results = scanner.nextLine();

   boolean mybool = Boolean.parseBoolean(results);
  System.out.println("The changed string name is " + mybool);

 }
}