package ArraySet;

public class ArraySet <T>{
    private T[] items;
    private int size;

    public ArraySet(){
        items=(T[])new Object[100];
        size=0;
    }

    public boolean contains(T x){
        for(int i=0;i<size;i++){
            if(x.equals(items[i])){
                return true;
            }
        }
        return false;
    }
    public void add(T x){
        if(!contains(x)){
            items[size]=x;
            size+=1;
        }
    }
}


 public static void main(String[] args) {
        ArraySet<Integer> aset = new ArraySet<>();
        aset.add(5);
        aset.add(23);
        aset.add(42);
 }