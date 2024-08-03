package io.javabrains.javabasics;

/*

1.  Create an `Animal` class with member variables for the name and age of the animal and a constructor method that initializes the member variables.
2.  Create a `Dog` class that extends the `Animal` class and has a member variable for the breed of the dog and a constructor method that initializes the member variables.
3.  Override the `makeSound` method in the `Dog` class to print "The dog barks".
4.  Create a `Cat` class that extends the `Animal` class and has a member variable for the number of lives of the cat and a constructor method that initializes the member variables.
5.  Override the `makeSound` method in the `Cat` class to print "The cat meows".
6.  In the `main` method of this class, create an array of `Animal` objects and initialize it with a `Lion`, a `Dog`, a `Cat`, and another `Animal` of your choice.
7.  Loop through the array of `Animal` objects and print the name, age, and sound of each animal.
 */


class Animal{
    public String name;
    public int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String makeSound(){
        return "The " +this.name+" makes Sound";
    }
}

class Dog extends Animal{
    public String breed;
    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    public String makeSound(){
        return "The dog barks";
    }
}

class Cat extends Animal{
    public Cat(String name, int age){
        super(name, age);
    }

    public String makeSound(){
        return "The cat meow";
    }
}

public class InheritanceChallenge {

    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Pussy", 2);
        animals[1] = new Dog("Puff", 5, "labrodar");
        animals[2] = new Animal("Simba", 20);
        animals[3] = new Animal("Human", 27);

        for(int i=0; i< animals.length; i++){
            System.out.println(animals[i].name);
            if(animals[i] instanceof Dog){
                Dog dog = (Dog) animals[i];
                System.out.println(dog.breed);
            }
            System.out.println(animals[i].age);
            System.out.println(animals[i].makeSound());
        }
    }
}
