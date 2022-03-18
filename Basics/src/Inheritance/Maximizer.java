package Inheritance;

public class Maximizer {
    public static OurComparable max(OurComparable[] items){
        int maxDex = 0;
        for (int i = 0; i < items.length; i++) {

            if(items[i].compareTo(items[maxDex]) >0 ){
                maxDex = i;
            }
        }
        return items[maxDex];
    }

    public static void main(String[] args) {
        Dog[] dogs = {new Dog("Alfie", 3),new Dog("Bat", 9),new Dog("Cat", 15) };
        Dog maxDog = (Dog) max(dogs);
        maxDog.bark();
    }
}
