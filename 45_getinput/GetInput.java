import java.util.Scanner;

public class GetInput{
  public static void main(String[] argsCS){
   Scanner names = new Scanner(System.in);
   

   System.out.println("What is your name ?");
    String name = names.nextLine();
   System.out.println("What is your name ?");
    String surname = names.nextLine();

   System.out.println("Your name is: " + name);
   System.out.println("Your name is: " +surname);
  }
}