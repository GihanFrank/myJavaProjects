package boolencheck;

class Test {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        String c="Gihan";
        String d = "Gihan";
        String e = new String("Gihan");
        String f =new String("Frank");
        String g=f;
        
        
        

        if(c==d){
            //System.out.println(c+" smanai "+d);
        }
        if(d.equals(e)){
            System.out.println(e+" Equals "+d);
        }
        System.out.println(d.toUpperCase());
       
    }
}
