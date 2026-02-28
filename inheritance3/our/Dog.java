package our;

public class Dog implements OurComparable{
    public String name;
    public  int size;
    public Dog(String n,int s){
        name=n;
        size=s;
    }
    public void bark() {
        System.out.println(name + " says: bark");//隐含了this指针
    }

    public int compareTo(Object o){
        Dog uddaDog=(Dog)o;
        return this.size-uddaDog.size;
    }
    
}
