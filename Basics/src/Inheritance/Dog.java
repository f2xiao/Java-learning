package Inheritance;

public class Dog implements OurComparable {
    String name;
    int size;
    public Dog(String n, int s){
        name = n;
        size = s;
    }
    public static Dog maxDog(Dog[] dogs){
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
    }


    public static void main(String[] args) {
        Poddle frank = new Poddle("Frank", 5);
        Malamute frankSr = new Malamute("Frank Sr.", 100);
        Dog[] dogs = {frank, frankSr};
        Dog largerPoddle =  maxDog(dogs);
    }

    public void bark() {
        System.out.println(name + " says: bark");
    }

    @Override
    public int compareTo(Object o) {
        Dog uddaDog = (Dog) o;
       /* if(this.size < uddaDog.size){
            return -1;
        }else if(this.size == uddaDog.size){
            return 0;
        }*/

        return this.size - uddaDog.size;
    }
}
