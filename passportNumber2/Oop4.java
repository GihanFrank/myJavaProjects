package Oop4;



// Passport office blue print...............
import java.util.*;

class passportHolder {

    String name = new String();
    int age;
    String address = new String();
    int entryNumber;

    public passportHolder() {
        name = "Not Assigned";
        age = 00;
        address = "Not Assigned";
        entryNumber = 00;

    }

    public passportHolder(String name, int age, String address, int entryNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.entryNumber = entryNumber;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    // public String getName() {
    // return name;
    // }

    // public int getAge() {
    // return age;
    // }

    // public String getaddress() {
    // return address;
    // }

    public String provideInfo() {
        return ("Passport Holder is " + this.name + ". Age is " + this.age + " years old. " + "Current address: "
                + this.address + " Passport Number: " + "N" + entryNumber + (1697 / 5 * 96));
    }
}

public class Oop4 {
    public static void main(String[] args) {
        Scanner getInfo = new Scanner(System.in);
        System.out.println("entry Nomber ");
        int entryNumber = getInfo.nextInt();
        passportHolder c1 = new passportHolder();
        passportHolder c2 = new passportHolder("Gihan", 22, "44A, Whiteway street", entryNumber);
        System.out.println(c1.provideInfo());
        System.out.println(c2.provideInfo());
    }

}
