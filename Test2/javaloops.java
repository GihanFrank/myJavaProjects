/**
 * javaloops
 */
public class javaloops {

    public static void main(String[] args) {
        
        //While loop

        int loopTest = 0;
        int[] numberArray={10,20,30,40,50};

       //while (loopTest<10){
            //loopTest++;
            //System.out.println(loopTest);
           // loopTest++;
       // }

        do {
            System.out.println(loopTest);
            loopTest++;
        
        }
        while (loopTest<=5);
        for(int i=0; i<numberArray.length; i++){
            System.out.println(numberArray[i]);
        }

           
    }

}