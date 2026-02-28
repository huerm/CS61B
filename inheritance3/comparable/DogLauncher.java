package comparable;

import java.util.Arrays;
import java.util.Collections;

public class DogLauncher {
    public static void main(String[] args) {
        Dog d1 = new Dog("Elyse", 3);
        Dog d2 = new Dog("Sture", 9);
        Dog d3 = new Dog("Benjamin", 15);
        Dog[] dogs = new Dog[]{d1, d2, d3};

        Dog largest = Collections.max(Arrays.asList(dogs));

        /*Dog d = (Dog) Maximizer.max(dogs);*/
        System.out.println(largest.name);

        /*个人认为一下部分很难理解 */
        Comparator<Dog> cd=new Dog.NameComparator();
        int maxDen=0;
        for(int i=0;i<dogs.length;i++){
            if(cd.compare(dogs[i],dogs[maxDen])>0){
                maxDen=i;
            }
        }
        dogs[maxDen].bark();
    }
}
