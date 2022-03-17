package Casting;

public class Dog {
    String name;
    int weight;
    public Dog(String n, int w){
        name = n;
        weight = w;
    }
    public static Dog maxDog(Dog d1, Dog d2){
        Dog max = d1;
        if(d2.weight > max.weight){
            max = d2;
        }
        return max;
    }

    public static void main(String[] args) {
        Poddle frank = new Poddle("Frank", 5);
        Malamute frankSr = new Malamute("Frank Sr.", 100);
        Dog largerPoddle =  maxDog(frank, frankSr);
    }
}
