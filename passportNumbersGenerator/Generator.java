package Newfolder;

class Generator{
    public static void main(String[] args) {
        Diplomatic p1=new Diplomatic(true, "Gihan Perera", 35);
        Diplomatic p2=new Diplomatic(false, "Gayan Perera", 64);
        Diplomatic p3=new Diplomatic(false, "Hiran Perera", 41);
        Diplomatic p4=new Diplomatic(false, "Evan Perera", 6);
        Passport p5=new Passport();
        Passport p6=new Passport("Mahesha Asiriwardhana",33);
        System.out.println(p1.getNumber());
        System.out.println(p2.getNumber());
        System.out.println(p3.getNumber());
        System.out.println(p4.getNumber());
        System.out.println(p5.getPassportNumber());
        System.out.println(p6.getPassportNumber());
       
        
    }

}
