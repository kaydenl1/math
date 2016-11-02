import java.util.Scanner;

public class Main{
  
  public static void main(Sting[] args){
    
  Scanner input = new Scanner(System.in);
  
  System.out.println("Inverse or Derivative?");
    
  String in = input.nextLine();
  
    if (in.equals("Inverse")){
      Inverse.desc();
    }
    else if (in.equals("Derivative")){
      Derivative.desc();
    }
  }
}