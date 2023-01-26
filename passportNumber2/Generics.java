package Oop4;

import java.util.ArrayList;
import java.util.List;

public class Generics{
    public static void main(String[] args){
    
    List<String> a=new ArrayList();
    String b="Gihan";
    int c=12;
    a.add(b);
    a.add(c);
    String d=a.get(0);
    System.out.println(d+"Name");
        }
    }