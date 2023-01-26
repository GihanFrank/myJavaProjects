public class Practice1 {
    public static void main(String[] args) {
        String s1=new String("acd");
        String s2=new String("abcd");
        StringBuffer sb1=new StringBuffer("1");
        System.out.println(sb1.capacity());
        boolean b1=true;
        sb1.append(b1);
        System.out.println(sb1);
        System.out.println(sb1.capacity());
    }
}
