public class  Arguements{
 
 // Create a checkAge() method with an integer called age
 static void checkAge(int age) {

 //if the age is less than 18 then , print "access denied"
   if(age < 18){
    System.out.println("Access denied - You are not old enough!");

 // if the age is greateer than , or equals to , print "access granted"
   }else{
   	 System.out.println("Access granted - You are old enough!");

   }

 }

  public static void main(String[] args){
    checkAge(20); // Call the checkAge method and pass along an age of 20 
  }
}