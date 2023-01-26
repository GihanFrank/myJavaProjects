public class MainT {

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;

        }
findPrime(a);
    }
public static void printPrime(int[] l){
    for(int i=2;i<l.length;i++){
if (l[i]==0){
        System.out.println(i);}
    }
}
    public static void findPrime(int[] k) {
        int[] b = new int[k.length];
        for (int i = 0; i < k.length; i++) {
            b[i] = 1;}
        for (int i = 2; i < k.length; i++) {

            for (int j = 2; j < k.length; j++) {
                if (k[j] % i == 0) {
                    b[j] = 0;
                }
            }printPrime(b);
        }
        
    }
}
