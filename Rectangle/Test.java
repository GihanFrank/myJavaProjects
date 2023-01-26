package rectangle;

class Test {
    public static void main(String[] args) {
        Rectangle a=new Rectangle();
      Center c=new Center(10,18); 
      Rectangle r= new Rectangle(56, 79, c); 
      System.out.println(r);
      //System.out.println(a);
      r.recMove(50,565);
      System.out.println(r);
      r.k.move(10,15);
      System.out.println(r);
    }
}

class Center{
    private int x;
    private int y;

public Center(int x, int y){
    this.x=x;
    this.y=y;
}
public void move(int x, int y){
    this.x=this.x+x;
    this.y=this.y+y;
}
public String toString(){
    return new String(this.x+", "+this.y);
}
}

class Rectangle{
private int width;
private int height;
protected Center k;

public Rectangle(){
    this.width=10;
    this.height=10;
    k=new Center(0,0);
}
public Rectangle(int width, int height, Center a){
    this.k=a;
    this.width=width;
    this.height=height;
}
public void recMove(int x, int y){
    k.move(x,y);
}

public String toString(){
    return new String(this.width+", "+this.height+", "+this.k);
}
}