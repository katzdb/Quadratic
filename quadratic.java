import java.util.InputMismatchException;
import java.util.Scanner;

public class quadform {
 
 static double root(double A, double B, double C) throws IllegalArgumentException {
        // Returns the larger of the two roots of the quadratic equation A*x*x + B*x + C = 0.
        // (Throws an exception if A == 0 or B*B-4*A*C < 0.)

     if (A == 0) {
       throw new IllegalArgumentException("A cannot be zero.");
       
}//if
     else {
        double disc = B*B - 4*A*C;
        System.out.println ("A = " + A + "  B = " + B + "  C = " + C);
        if (disc < 0)
           throw new IllegalArgumentException("Discriminant < zero.");
        return  (-B + Math.sqrt(disc)) / (2*A);
}//else
     
}//root
 
 public static void main(String [] args){
   double A,B,C;
  
   try{
   System.out.println("Welcome to the quadratic equation solver!");
   Scanner scan1=new Scanner(System.in);
   Scanner scan2=new Scanner(System.in);
   Scanner scan3=new Scanner(System.in);
   System.out.println("Please input the coefficients of the polynomial in question");
   A=scan1.nextDouble();
   B=scan2.nextDouble();
   C=scan3.nextDouble();
      
      System.out.println("The greatest root is: "+ root(A,B,C));
 
   }//try
      catch(IllegalArgumentException e){
       System.out.println("Exception: "+e.toString());
       
      }
    
   
      catch(InputMismatchException hadf){
       System.out.println("Exception: "+ hadf.toString());
       
      }
   
    finally{
       System.out.println("The program is exiting because an error was created");
       
      }
      
   
  }//main
  
}
