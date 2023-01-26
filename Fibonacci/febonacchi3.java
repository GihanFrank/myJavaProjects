public class febonacchi3 {
    public static void main(String[] args){
        int n=1150;int count=0;
        int devider;
        for(int i=1; i<=n; i++){
            devider=n/2;
            n=devider;
            System.out.println(devider);
             if(n%2==0){
                 count++;
                 
             }


        }
    }
    
}
