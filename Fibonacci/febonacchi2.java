public class febonacchi2 {
    public static void main(String[] args){
        int n=10;
int p=0;
        for (int i=1; i<=n; i++){
            int temp = i+p;
            p=temp;
            System.out.println(temp);
        }
    }
    
}
