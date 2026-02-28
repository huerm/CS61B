package comparable;

public interface Comparable<T> {
    public int compareTo(T obj);//参数直接是T类型的，减少一步强转  
}
//该文件可以删掉，后面Dog类中用的是系统自带的Comparable接口，其中内置了该method