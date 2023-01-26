import java.math.*;
class Test{
public static void main(String[] args){
	MyInt l=new MyInt(10);
MyInt m=new MyInt(30);
System.out.println(m.sum(l));
System.out.println(m.pow(l));

	}
}
class MyInt{
private int x;

public MyInt(int x){
this.x=x;
	}
public MyInt sum(MyInt a){


return new MyInt(this.x+a.x);
	}
public MyInt pow(MyInt a){
int b=(int)Math.pow(this.x,a.x);
return new MyInt(b);
	}
public String toString(){
return new String(x+" ");
	}
}