import java.util.Scanner;

public class StringConcatination{
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
   String masterLine = "Tshiamo is so cool!";

   System.out.println("Please enter enter your masterLine");
   String sentence = scanner.nextLine();

  System.out.println(sentence + "\n" + masterLine);
  }
}