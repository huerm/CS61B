package Intlist;
public class IntlistPractice {
    public static class Intlist{
        public int first;
        public Intlist rest;

        public Intlist(int f,Intlist r){
            first=f;
            rest=r;
        }
    }
    public static Intlist incrList(Intlist L,int x){
        if(L==null){
            return null;
        }
        return new Intlist(L.first+x,incrList(L.rest,x));
    }

    public static void printlist(Intlist L){
        while(L!=null){
            System.out.println(L.first);
            if(L.rest!=null){
                System.out.println("->");
            }
            L=L.rest;
        }
        System.out.println();
    }

    public static void main(String[] ags){
        Intlist L=new Intlist(43,null);
        L=new Intlist(3,L);
        Intlist incrResult=incrList(L,2);
        printlist(incrResult);
        printlist(L);
    }
}
