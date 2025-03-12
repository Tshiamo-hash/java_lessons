import java.util.ArrayList;
import java.util.Iterator;
public class Main{
  public static void main(String[] args){

    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Audi");
    cars.add("Toyota");
    cars.add("Mercedes");
    cars.add("VW");

    Iterator<String> it =cars.iterator();

    System.out.println(it.next());

  }
}