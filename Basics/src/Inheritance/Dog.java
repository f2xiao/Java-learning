package Inheritance;

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


    public static void main(String[] args) {
        Dog[] dogs = {new Dog("Alfie", 3),new Dog("Bat", 9),new Dog("Cat", 15) };
        Dog maxDog = (Dog) max(dogs);
        maxDog.bark();
    }
}
