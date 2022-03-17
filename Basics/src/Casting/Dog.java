package Casting;

public class Dog {
    String name;
    int weight;
    public Dog(String n, int w){
        name = n;
        weight = w;
    }
    public Dog maxDog(Dog d1, Dog d2){
        Dog max = d1;
        if(d2.weight > max.weight){
            max = d2;
        }
        return max;
    };
}
