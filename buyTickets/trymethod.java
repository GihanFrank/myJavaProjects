import java.util.*;

public class trymethod {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your ticket Number: ");
        int ticketNumber = a.nextInt();
        System.out.println("Enter your ticket price: ");
        int ticketPrice = a.nextInt();
        // System.out.println("your ticket price "+discountTkt(ticketNumber));
        // System.out.println(yourSeat(ticketNumber));
        if (ticketNumber >= 1 && ticketNumber <= 15) {
            System.out.println(discountTkt(ticketPrice, ticketNumber));
        } else if (ticketNumber >= 16 && ticketNumber <= 25) {
            System.out.println(discountTkt(ticketPrice, ticketNumber));
        } else if (ticketNumber <= 35 && ticketNumber >= 26) {
            System.out.println("No discount added " + discountTkt(ticketPrice, ticketNumber));
        }
    }
    // for(int i=1; i<ticketNumber; i++){

    public static int discountTkt(int b, int c) {
        int discount1 = b * 20 / 100;
        int discount2 = b * 10 / 100;
        int noDiscount = 0;
        if (c <= 1 && c >= 15) {
            return b - discount1;
        } else if (c <= 16 && b >= 25) {
            return b - discount2;
        } else if (c >= 26 && c <= 50) {
            return noDiscount;
        } else {
            return 0;
        }
    }

}
// public static int yourSeat(int a){
// int count=0;
// for(int i=0; i<=a; i++){
// count = i;
// //return count;

// }
// return count;
