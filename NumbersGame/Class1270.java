import java.util.*; //user inputs from libraries

public class Class1270 {
    public static void main(String[] args) {
        // Scanner s=new Scanner(System.in);
        // System.out.println("Enter the value? ");

        // int userValue= s.nextInt();
        // System.out.println(userValue%10);
        // System.out.println(21/6);// 8888888888888888arthmatic operations done using
        // integers answers also given by integers/////

        var var = new Scanner(System.in);
        System.out.print("Enter the First Value? ");
        int firstValue = (int) var.nextInt();
        System.out.print("Enter the Second Value? ");
        int secondValue = (int) var.nextInt();

        int sum = firstValue + secondValue;
        int sub = firstValue - secondValue;
        int pro = firstValue * secondValue;
        int divi = firstValue / secondValue;
        int rema = firstValue % secondValue;

        System.out.println("Sum = " + sum + "\nSubstraction = " + sub + "\nProduct = " + pro + "\nDivision = " + divi
                + "\nRemainder = " + rema);
        if (firstValue == secondValue) {
            int proTwo = sum * pro;
            System.out.println("In puts are correct " + "Product is " + proTwo);
        } else {
            System.out.println("inputs are not equal ");
        }
    }

}
