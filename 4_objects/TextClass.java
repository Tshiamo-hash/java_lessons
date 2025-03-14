public class TestClass{
  public void doMath(){
    int a = 5;
    int b = 10;
    int c = a+b;
    System.out.println(c);
  }
  public static void main(String[]args){
    TestClass obj = new TestClass();
   obj.doMath();
  }
}