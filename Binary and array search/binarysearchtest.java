public class binarysearchtest {
    public static void main(String[] args){

        int[] a={1,2,3,4,5,6,7,8,9};

        int b=a.length;
        int d = (a.length)/2;
        binary1(a,7);

    }
    public static void binary1(int[] a, int c){
        int d = (a.length)/2;
        for (int i=0; i<a.length && c>=d;i++){
           
            if(c==a[i]){
                System.out.println("position = "+i+" number = "+a[i]);
                System.out.println(a[d]+" ==llll");
                int f=d;
                int g =(a.length-d)/2;
                d=g;
            }


        }
    }
    
}
