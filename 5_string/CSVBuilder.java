import java.util.Scanner;

public class CSVBuilder{
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

  System.out.println(name +" "+ surname +" " + age);

 }
 
}