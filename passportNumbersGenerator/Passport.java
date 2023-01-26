package Newfolder;

class Passport {
    private String name;
    private int age;
    private int passportNumber;

    public Passport(){
        name="Not Assigned";
        age=00;
    }
    public Passport(String name, int age){
        this.name=name;
        this.age= age;
        passportNumber= (age*720)+2002*323;
    }


public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public int getPassportNumber() {
    return passportNumber;
}
public void setPassportNumber(int passportNumber) {
    this.passportNumber = passportNumber;
}
    
}
