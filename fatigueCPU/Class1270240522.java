import java.util.*;
public class Class1270240522 {
    public static void main(String[] args){
//for( ;i<=100; ){} this is also correct. use while for this kind of purposes.
// how to prevent minus issue=========
//=====
// declare varible as long = asdf insted as int//but this also gets minus at some point... or intereger class but we dont use it much...
// do while loop is the east used loop
long current=1;
long previous=0;
long temp;

        for(int i=0; i<=50;i++){

    System.out.print(current+", ");
    temp=current;
    current=previous+current;
    previous=temp;
}
        //**  */
        
    }
    
}
