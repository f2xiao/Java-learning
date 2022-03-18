package Inheritance;

public class max {
    public static Object max(Object[] items){
        int maxDex = 0;
        for (int i = 0; i < items.length; i++) {
            if(items[i] > items[maxDex]){
                maxDex = i;
            }
        }
        return items[maxDex];
    }

    public static void main(String[] args) {
        Dog[] dogs = {new Dog("Aflie", 3),new Dog("Betty", 9),new Dog("Cindy", 15) };
        Dog maxDog = (Dog) max(dogs);
        maxDog.bark();
    }
}
