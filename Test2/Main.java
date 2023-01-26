/**
 * Main
 */
public class Main { // this is the main function
    public static void main(String[] args) { // this is the sub function both are neccessary
        // anything start with '\' is an escape sequence
        // print- just print// println-print line. \n- next line. \t- tab to texts.
        // if you need quated texts use "\"Gihan\""; output will be "Gihan"
        // if you need forward slash "\\I"; output is \I
        System.out.println("\tGihan");
        System.out.print(" is My Name !");
        System.out.print("\nI am ");
        System.out.print("\"31\"");
        System.out.println(" years\\ old.");

        System.out.println(3 + 3); // variable declaration **String **int **boolean ** float(double) **char//
        System.out.println(6 + 3);
        int a1 = 10;
        int a2 = 4474;
        int a3 = a2 - a1;
        boolean b1 = true;
        float myFloat = 5.99f; // here letter f at the end is essential
        System.out.println(a3 * a1); // we can perform mathematical operationas inside the
                                     // parenthesiss for intergers//
                                     // multiple variable declaration int a=5, b=2, c=3;
        System.out.println(myFloat);
        int a = 10, b = 10, c = 10;
        System.out.println(a + b + c);
        // scientific Numbering
        double scientificNumber = 42e6d;
        System.out.println(scientificNumber);
        // char varibles must be surrounded by '' sigle quates
        char singleQuote = 'B';
        System.out.println(singleQuote);
        String myName = "Gihan";
        System.out.println(myName + " " + b1);

        //////////////////////////////////////
        ///////////////////////////////////////
        /** if elseif than switch */
        ///////////////////////////////////////

        if (a >= a2) {
            System.out.println("A1 is Greater or Equals to A1\'s A2.");
        } else {
            System.out.println("Nah" + a1 + ", " + a2);
        }

        //// if else TERNARY OPERATOR(easier method///)//
        String ternery = (a >= a1) ? "A is greater" : "A1 is gretaet";
        System.out.println(ternery);

        ///////////// SWITCH CASE////

        int day = 5;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Northing");
        }
        // Swich case method for String variables//
        // // //
        String swichTest = "Gihan";
        switch (swichTest) {
            case "frank":
                System.out.println("Middle Name.");
                break;
            case "Gihan":
                System.out.println("First name");
                break;
            default:
                System.out.println("Unknown Name");

        }

    }

    

}
// 21 minutes