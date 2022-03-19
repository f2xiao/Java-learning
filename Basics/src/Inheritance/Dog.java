package Inheritance;

import java.util.Comparator;

import static Inheritance.Maximizer.max;

public class Dog implements Comparable<Dog> {
    private String name;
    private int size;
    public Dog(String n, int s){
        name = n;
        size = s;
    }
   /* public static Dog maxDog(Dog[] dogs){
        if(dogs==null || dogs.length==0){
            return null;
        }
        Dog maxDog = dogs[0];
        for (Dog dog : dogs) {
            if (dog.size> maxDog.size) {
                maxDog = dog;
            }
        }

        return maxDog;
    }*/


    public void bark() {
        System.out.println(name + " says: bark");
    }

    @Override
    public int compareTo(Dog uddaDog) {
       /* if(this.size < uddaDog.size){
            return -1;
        }else if(this.size == uddaDog.size){
            return 0;
        }*/

        return this.size - uddaDog.size;
    }

    private static class NameComparator implements Comparator<Dog>{
        @Override
        public int compare(Dog a, Dog b) {
            return a.name.compareTo(b.name);
        }
    }

    public static Comparator<Dog> getNameComparator(){
        return new NameComparator();
    }




    public static void main(String[] args) {
        Dog d1 =new Dog("Alfie", 3);
        Dog d2 =new Dog("Cat", 9);
        Dog d3 =new Dog("Bat", 15) ;
        Dog[] dogs = {d1,d2,d3};
        Comparator<Dog> nc = Dog.getNameComparator();
//        Dog maxDog = (Dog) max(dogs);
//        maxDog.bark();
        if(nc.compare(d1,d3) >0){
            d1.bark();
        }else{
            d3.bark();
        }
    }
}
