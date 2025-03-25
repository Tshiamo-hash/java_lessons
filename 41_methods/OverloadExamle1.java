public class OverloadExamle1{
 static int plusMethodInt(int x , int y){
  return x + y;
 }

 static double plusMethodDouble(double x , double y){
  return x + y;
 }

 public static void main(String[] args){
  int myNum1 = plusMethodInt(5 , 5);
  double myNum2 = plusMethodDouble(6.5 , 6.5);
  System.out.println("int:" + " " + myNum1);
  System.out.println("double:" + " " + myNum2);
 

 }
}