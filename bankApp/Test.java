import java.math.*;
import java.util.*;
class Test{
	public static void main(String[] args){
		Account[] accHolders=new Account[50];
		Savings sav01=new Savings("Gihan Frank",1987);
		Savings sav02=new Savings("Mahesha Perera",1988);
		Savings sav03=new Savings("Evan Perera",2018);
		Cheqing chq01= new Cheqing("Ranjith Perera",1956);
		Cheqing chq02= new Cheqing("Hiran Perera",1982);
		accHolders[0]=sav01; accHolders[1]=sav02; accHolders[2]=sav03; accHolders[3]=chq01; accHolders[4]=sav02;
		accSet(accHolders);
	}
	
	public static void accSet(Account[] a){
		for(int i=0;i<50;i++){
			
		
		System.out.print(a[i].toString());
		System.out.println(" ");
		
		}
	}
}

abstract class Account{
	protected String Name;
	protected int AccId;
	protected int bDay;
	
	public Account(String Name, int bDay){
		this.Name=Name;
		this.bDay=bDay;
	}
	
	abstract protected void AccNo();
	
	//public void toString(){
	//System.out.prinlt("Name of the Holder___ "+this.Name+" Account No___ "+this.AccId);
//}
}

class Savings extends Account{
	protected int savAcc;
	
	public Savings(String Name, int bDay){
		super(Name,bDay);
		
	}
public void AccNo(){
	int temp = 1800+((int)Math.random()*this.bDay);
	this.savAcc=temp+this.bDay;
	this.AccId=temp;
}

public String toString(){
	String a=String.valueOf(this.savAcc)+"Name of the Holder___ "+this.Name+" Account No___ "+String.valueOf(this.AccId);
	return a;
}
	
}

class Cheqing extends Account{
	protected int chqAcc;
	
	public Cheqing(String Name, int bDay){
		super(Name,bDay);
		
	}
public void AccNo(){
	int temp = (int)Math.random()*this.bDay;
	this.chqAcc=temp+this.bDay;
	
}

//public void toString(){
	//System.out.print(this.chqAcc);
//}
	
}