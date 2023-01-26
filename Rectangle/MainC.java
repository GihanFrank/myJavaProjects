class Point{
private int x;
private int y;

public Point(){
this.x=1;
this.y=0;
	}
public Point(int x,int y){
this.x=x;
this.y=y;
	}
public void move(int x,int y){
this.x+=x;
this.y+=y;
}

public String getPoint(){
String l="X= "+this.x+" Y= "+this.y;
return l;
	}
}
class Rectangle{
private int width;
private int height;
private Point startP;

public Rectangle(){
this.width=this.height=10;
this.startP=new Point();
	}

public Rectangle(Point a){
width=height=10;
startP=a;
}

public void moveR(int x, int y){
	this.startP.move(x,y);
}

public void getRec(){
System.out.println("Area of the REC = "+(this.width*this.height)+" Start Point = "+this.startP.getPoint());
	}
}

class MainC{
public static void main(String[] args){
Point p=new Point(25,31);
Rectangle q=new Rectangle(p);
q.getRec();
p.move(3,4);
//p.getPoint();
System.out.println("p");
q.getRec();

System.out.println("p");
q.moveR(2,5);
q.getRec();
System.out.println(p.getPoint());


	}
}