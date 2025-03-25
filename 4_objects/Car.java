public class Car{
 static void drive(){
  String color = "Black";
  String model = "Land Rover";
  int year = 2020;
System.out.println("The " + color + " " + model + " " + "is drivng");
  }

// creating a Car object
  public static void main(String[] args){
   Car myCar = new Car();
  //Using the object methods
   myCar.drive();

  }

}