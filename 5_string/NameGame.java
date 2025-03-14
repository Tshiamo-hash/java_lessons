public class NameGame{
  public static void main(String[]args){
     String firstName = "Jacobs";
     String lastName = "Ngobeni";

     // joining the strings together
     String fullName = firstName + " " + lastName;
     System.out.println("His full name is :" + fullName);

    // Getting the length
     int nameLength = fullName.length();
     System.out.println("The full name has" + " " + nameLength +" " + "characters");
  }
}