public class oop {
    /*Student s1 = new Student();
    Student s2 = new Student("ayushi");
    Student s3 = new Student(123);
    //Student s4 = new Student("sani", 567); throws error*/

    /*Fish shark = new Fish();
    shark.eat();
    shark.breathe();
    shark.swim();*/

    public static void main(String args[]){
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}
class Student{
    String name;
    int roll;

    Student(){
        System.out.println("constructor is called");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    //int legs;
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}

class Dog extends Mammal{
    String breed;
}
//derived class
/*class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}*/

