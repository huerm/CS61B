package Intlist;
public class IntlistPractice2 {
    public static class Intlist{
        public int first;
        public Intlist rest;

        public Intlist(int f,Intlist r){
            first=f;
            rest=r;
        }
    }
    public static Intlist dincrList(Intlist L,int x){
        Intlist Q=L;
        while(L!=null){
            L.first+=x;
            L=L.rest;
        }
        return Q;
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
        Intlist incrResult=dincrList(L,2);
        printlist(incrResult);
        printlist(L);
    }
}
