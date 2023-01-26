package Newfolder;



class Diplomatic extends Passport {
    boolean isDiplomatic;

    public Diplomatic(boolean isDiplomat, String name, int age) {
        super(name, age);
        this.isDiplomatic=isDiplomat;
    }

    public String getNumber(){
        if(isDiplomatic)
        return ("Passport Number: "+getName()+" N"+getPassportNumber()+"Diplomatic");
        else
        return ("Passport Number: "+getName()+" N"+getPassportNumber()+" Official");
    }
}
