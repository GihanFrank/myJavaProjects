import java.util.*;
public class fun01{
    public static void main(String[] args){

//     Scanner input=new Scanner(System.in);
//     System.out.println("Enter your Value");
//     int userValue=input.nextInt();
//     int i=1;
//     int k= userValue%2;
//     if(k==0){
//         System.out.println("Evan Number");
//         }
//         else if (k!=0) {
// while(i<=userValue){
    
//     System.out.println(i);
//     i++;
//     i=i+1;
    
int lgTank=500;
int smTank=200;
Scanner n=new Scanner(System.in);
System.out.println("Large oil truks?");
int lgOil=n.nextInt();
System.out.println("Small oil truks?");
int smOil=n.nextInt();
int totalOil=lgTank*lgOil+smTank*smOil;
int forCar=(totalOil*40/100);
int forBus=totalOil*40/100;
int forBike=totalOil-forCar-forBus;

int carNum=forCar/30;
int busnum = forBus/50;
int moreBike= forCar%30+forBus%50;
int totalBike= moreBike+forBike;
int bikeNum=totalBike/10;
int remain=bikeNum%10;

System.out.println(totalOil+"L, "+forCar+"L, "+forBus+"L, "+forBike+"L");
System.out.println("Number of Cares = "+carNum);
System.out.println("Number of Busese = "+busnum);
System.out.println("Number of Bikes = "+bikeNum);
System.out.println("remaining in the Tank = "+remain+"L");

}
            
        } 




















   // }
//}
    
    


