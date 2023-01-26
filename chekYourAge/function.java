import java.util.*;
public class function {
   // static int myFunction(int birthYear){// int after static needs a return value also if its void instead of int or char there is no retun value
        //var a=new Scanner(System.in);
        //System.out.println("What is your birth year?");
        //int birthYear=(int)a.nextInt();
//int myAge= 2022-birthYear;
        //System.out.println("I am "+myAge+" years Old.");
        
       // return myAge;
       static int ageCheck(int age){
        if(age<=18){
            String permissio="Nor allowed";
            System.out.println(permissio);
        }
        else{
            String permissio="Allowed";
            System.out.println(permissio);
        }
        return age;
    } 

    
   
    

   public static void main(String[] args){
     // System.out.println(myFunction(1987));
      ageCheck(17);
   }
}
