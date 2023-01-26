public class  febonacchi {
    public static void main(String[] args){
int n=10;
        int c=1;
        int p=0;
        int temp;
        int i;
        for(i=0; i<=n; i++){

           
          
            
            temp=c+p;
            p=c;
            c=temp;
            //c=temp;
        
            System.out.println(c+", ");
        }
    }
    
}
