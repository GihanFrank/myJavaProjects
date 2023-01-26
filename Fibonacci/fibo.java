import java.util.*;
public class fibo {
    public static void main(String[] args){
Scanner a=new Scanner(System.in);
System.out.println(" enter value");
int n=(int)a.nextInt();
int x=0;
int y =1;
int z=0;
for(int i=0; i<=n;i++){
    z=y+x;
    x=y;
    y=z;
    System.out.print(z+" ");
}

    }
    
}
