class Gihan{
private String name;
private int age;

public Gihan(String name, int age){
this.name=name;
this.age=age;
	}
public void setName(String name){
this.name=name;
	}
public void getALL(){
System.out.println(this.name+", "+this.age);
	}
}

class Mainr{
public static void main(String[] args){
Gihan g1=new Gihan("Frank",12);
g1.getALL();
g1.setName("Perera");
g1.getALL();
	}
}