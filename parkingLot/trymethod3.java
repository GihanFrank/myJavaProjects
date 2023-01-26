public class trymethod3 {
    public static void main(String[] args) {
        int numOfStudent = 45;
        int studentId = 26;
        numToi(numOfStudent);
        numSanitizer(numOfStudent);
        System.out.println("************** FOR STUDENTS******************");
        System.out.println(" ");
        if (studentId <= 20 || numOfStudent < 20) {
            System.out.println("Your Parking area: A");
        } else if (studentId >= 21 && studentId <= 40 && numOfStudent >= 40) {
            System.out.println("Your Parking area: B");
        } else {
            System.out.println("Not enough parking spaces: Please contact the traffic contol");
        }
        System.out.println(" ");
        System.out.println("**************---------******************");
        System.out.println(" ");
    }

    public static void numToi(int t) {
        System.out.println("Number of Ts requird : " + t / 20);
    }

    public static void numSanitizer(int san) {
        int count=1;
        int i=1;
        while(i<=san){
            san--;
            if (san%2!=0){
                 count=san;
                san--;
                
            }//else{
            //     System.out.println();
            // }
        //photographer has to take odds 
            

            
        
        System.out.println("Sanitizers" + count);
        }
    }
}
