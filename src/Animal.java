public class Animal {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();

        Dog dog = new Dog();
        dog.makeNoise();

        Cat cat = new Cat();
        cat.makeNoise();

        System.out.println("");

        Animal[] animalArray = {animal,dog,cat};

        for(Animal a : animalArray){  //Even though each animal in the array has been cast to the animal class
            a.makeNoise();            //Dynamic polymorphism means that they still retain the overridden methods
        }                             //In the subclass rather than the class that they have been cast to
    }

    Animal(){
    }

    public void makeNoise(){
        System.out.println("None");
    }
}
