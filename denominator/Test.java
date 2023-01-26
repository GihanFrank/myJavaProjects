package denomnom;
import java.math.*;
public class Test {
    public static void main(String[] args) {
      MyInt a=new MyInt();
      System.out.println(a);
      MyInt b=new MyInt(10,21);
      System.out.println(b);
      MyInt c=new MyInt(55,63);
      System.out.println(c);
      MyInt d = b.add(c);
      System.out.println(d);
      System.out.println(c.power());

    }
}

class MyInt{
    private int denom;
    private int nom;

    public MyInt(){
        this.denom=1;
        this.nom=0;
    }
    public MyInt(int denom, int nom){
        this.denom=denom;
        this.nom=nom;
    }

    public String toString(){
        return new String(this.nom+" / "+this.denom);
    }

    public MyInt add(MyInt a){
        int k=(this.nom * a.denom);
        int l=(this.denom * a.nom);
        int m =(this.denom * a.denom);
        int n = k+l;
        return new MyInt(m,n); 
    }
    public int power(){
        int a = (int)Math.pow(this.denom , this.nom);
        return a;
    }
    

}