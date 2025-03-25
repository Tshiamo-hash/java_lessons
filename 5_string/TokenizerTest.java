import java.util.StringTokenizer;
import java.util.Scanner;

public class TokenizerTest{
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  String name;
  String surname;
  int age;

  System.out.println("What is your name ?");
  name = scanner.nextLine();

  System.out.println("What is your surname?");
  surname = scanner.nextLine();

  System.out.println("How old are you?");
  age = scanner.nextInt();

  String allStr = name + "," + surname+ "," + age;

   StringTokenizer str = new StringTokenizer(allStr);
   System.out.println("name" +","+ "surname" + "," + "age");
   System.out.println(allStr);


 }
 
}