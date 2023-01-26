class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return new String("Point Coordinates ="+this.x+" "+this.y);
    }
    public void move(int x, int y){
        this.x=this.x+x;
        this.y=this.y+y;
    }
}
class TestPoint{
    public static void main(String[] args) {
        Point p1=new Point(10,16);
        System.out.println(p1);
        p1.move(5,3);
        System.out.println(p1);
    }
}