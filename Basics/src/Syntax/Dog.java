package Syntax;

public class Dog {
    public int weightInKgs;
    public void bark(){
        System.out.println("bark!");
    }

    public Dog(int startingWeight){
        weightInKgs = startingWeight;
    }

    public static Dog[] removeNullDogs(Dog[] returnedDogs, int cnt){
        Dog[] noNullDogs = new Dog[cnt];
        for (int i = 0; i < cnt; i++) {
            noNullDogs[i] = returnedDogs[i];
        }
        return noNullDogs;
    }

    public static boolean isValidIndex(Dog[] dogs,int k){
//        if(k<0){
//            return false;
//        }
//        if(k>=dogs.length){
//            return false;
//        }
//        return true;
        return k>=0 && k<dogs.length;
    }

    public static boolean isBiggestOfFour(Dog[] dogs, int i){
        boolean isBiggest = true;
        for (int j = -2; j < 2; j++) {
            if(j==0){
                continue;
            }
            if(isValidIndex(dogs,i+j)){
                if(dogs[i].weightInKgs<=dogs[i+j].weightInKgs){
                    isBiggest = false;
                }
            }
        }
        return isBiggest;
    }

    public static Dog[] largerThanFourNeighbors(Dog[] dogs){
        int cnt = 0;
        Dog[] returnedDogs = new Dog[dogs.length];
        for (int i = 0; i < dogs.length; i++) {
            if(isBiggestOfFour(dogs,i)){
                returnedDogs[cnt]= dogs[i];
                cnt ++;
            }
        }
        returnedDogs = Dog.removeNullDogs(returnedDogs,cnt);
        return returnedDogs;
    }

    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{
                new Dog(10),
                new Dog(15),
                new Dog(20),
                new Dog(15),
                new Dog(10),
                new Dog(5),
                new Dog(10),
                new Dog(15),
                new Dog(22),
                new Dog(15),
                new Dog(20),
        };
        Dog[] bigDogs = Dog.largerThanFourNeighbors(dogs);
        for (int i = 0; i < bigDogs.length; i++) {
            System.out.print(bigDogs[i].weightInKgs+" ");
        }
        System.out.println();
    }
}
