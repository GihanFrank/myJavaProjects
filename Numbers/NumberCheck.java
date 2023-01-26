class Gihan {
    double a;
    double b;

    public Gihan(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return new String("A= " + this.a + " B= " + this.b);
    }
}

interface Numbers {
    public void money(double a);

    public void marks(double a);
}

class Account extends Gihan implements Numbers {
    String name;

    public Account(String a, double b, double c) {
        super(b, c);
        this.name = a;
    }

    public void money(double a) {
        System.out.println("My bank is " + this.name + " of " + a + " amount");
    }

    public void marks(double a) {
    }

}

class Exam extends Gihan implements Numbers {
    String name;

    public Exam(String a, double b, double c) {
        super(b, c);
        this.name = a;
    }

    public void money(double a) {

    }

    public void marks(double a) {
        System.out.println("My marks for " + this.name + " is " + a + ".");
    }

}

class NumberCheck{
    public static void main(String[] args) {
        Gihan[] g1= new Gihan[2];
        Exam e1=new Exam("Chemistry", 100, 80);
        Account a1 = new Account("Sampath", 500, 4200);
        e1.marks(53);
        a1.money(5366);
        g1[0]=e1; g1[1]=a1;

        for(int i=0;i<g1.length;i++){
          System.out.println(g1[i].toString());
          e1.marks(53);
          a1.money(5366);
        }
             

    
        
    }
}