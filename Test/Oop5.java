public class Oop5 {
    public static void main(String[] args) {
//         String s1=new String();
//         String s2=new String("Gihan");
// String s3="Gihan";
// String s4;
// s4="Gihan";
// char[] s5={'a','b','c','d','e','f'};
// char s6='a';
// String[] s7={"Perera","Frank"};
// String s8= new String(s5);
// String s9 = new String(s5,2,3);

//         System.out.println(s1);
//         System.out.println(s2);
//         System.out.println(s3);
//         System.out.println(s4);
//         System.out.println(s5[2]);
//         System.out.println(s6);
//         System.out.println(s7);
//         System.out.println(s8.charAt(2));
//         System.out.println(s9);


//Section two//
// String s0=new String("Computing and Systems");
// String s1="'a','b','c','d','e','f','g','h','i'";
// String[] s2={"Gihan","Frank","Perera","Jayasundara","Arachchige","Evan","Jeremiah","Perera","k","l"};
// char[] s3=s0.toCharArray();


// //System.out.println(s1.length());
// System.out.println(s2.length);
// // System.out.println(s0.indexOf("t"));
// // System.out.println(s0.charAt(3)); 
// // System.out.println(s3); 
// //  
String[] a={"a","b","c","d","e","b"};
String d;

int c= a.length;
if(c%2 ==0){
    int k;
k=(c/2);
System.out.println(k);
for(int i=0;i<k;i++){
    
d=a[i];
a[i]=a[c-i-1];
a[c-1-1]=d;
}
}
else {
    int k;
    k=(c/2)+1;
    for(int i=0;i<k;i++){
        d=a[i];
        a[i]=a[c-i-1];
        a[c-1-1]=d;
    
}}

for(int i=0;i<a.length;i++){
    System.out.println(a[i]);
}

// for(int i=0;i<a.length;i++){
//     int d=a.length;
//     char[] c=new char[a.length];
//     //System.out.println(a[i]);

// //System.out.println(b);
// //c[i]=a.charAt(d-i-1);

// System.out.println(c[i]);
// }
}}

