import java.util.StringTokenizer;

public class Tokenizer{
 public static void main(String[] args){

  StringTokenizer str = new StringTokenizer("THIS IS A BOOK");
  while(str.hasMoreTokens()){
   System.out.println(str.nextToken());


  }
 }
}