package Vehicle;
abstract class Vehicle {
    private int cylinder;
    private int doors;
    private String color;

    public Vehicle(int cylinder, int doors, String color){
        this.doors=doors;
        this.cylinder=cylinder;
        this.color=color;
    }
public void horn(){}

    public String toString(){
        return new String(this.doors+", "+this.cylinder+", "+this.color);
    }
}
