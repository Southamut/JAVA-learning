public class oop_basic {
    public static void main(String[] args) {
        // this dog1 is instance of Dog so that mean we create new obj(dog1) from base
        // obj(class Dog)

        // create instance 1
        Dog dog1 = new Dog("Mike", "Chihuahua", 1);// you can asign properties in new obj
        dog1.bark("cat");// you can input outer parameter in that method as well
        dog1.run();// you can call method that use properties in there class

        // create and use method to assignment
        Dog dog3 = new Dog("Ron", "Chisu", 2);
        dog3.run();

        Dog dog4 = new Dog();// this will call default Dog method

        System.out.println("-----------------------------------------");

        // for interface
        Mp3Player p1 = new Mp3Player();
        p1.play();
        p1.stop();
        p1.record();

        // you can use interface as Type of class like this
        Playable p2 = new FlacPlayer();
        p2.play();
        p2.stop();

        // But you can not call other interface if create instance from using interface
        // Ex
        // Playable p3 = new Mp3Player();
        // p3.record(); // this can not be run

        System.out.println("-----------------------------------------");

    }
}

// class
// class is like blueprint of object
class Dog {
    // properies
    String name;
    String breed;
    int age;

    // you also can crete method to recieve properties
    // this call "Constructure" it use like Dog dog1 = new Dog(); to create new
    // instance
    // No need to use void
    Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        showStatus();// you also an call method in class like this
    }

    // we can create defult Construction is no input like this
    // you can see this method use Dog() the same name
    // its call "Overloading"
    Dog() {
        this.name = "No name";
        this.breed = "Unknow";
        this.age = 0;
        showStatus();// you also an call method in class like this
    }

    // method
    // void is return type
    void bark(String item) {
        System.out.println("Woof! that " + item);
    }

    void run() {
        System.out.println(this.name + " is running");
    }

    void sleep() {
        String name = "Jo";
        System.out.println(this.name + " is sleeping");
        // if we use (name + " is sleeping") it will call name inside method insteed of
        // in Dog preoperties
        // so we need to use "this.name" to tell the method that you need to use name
        // from properties
    }

    void showStatus() {
        System.out.println("Name: " + this.name);
        System.out.println("Breed: " + this.breed);
        System.out.println("Age: " + this.age);
    }
}
// -----------------------------------------------------------------------------------------------------//

// interface
// interface is blueprint of "behavior"
// class that implete interface must have all bevaior of interface in it to not
// error
interface Playable {
    void play();

    void stop();
    // this mean class that will implete this must have play, stop method atleast

}

interface Recordable {
    void record();

}

class Mp3Player implements Playable, Recordable {

    public void play() {
        System.out.println("Mp3 is playing");
    }

    public void stop() {
        System.out.println("Mp3 is stoping");
    }

    public void record() {
        System.out.println("Mp3 can record");
    }

}

class FlacPlayer implements Playable {
    public void play() {
        System.out.println("FLAC is playing");
        status();
    }

    public void stop() {
        System.out.println("FLAC is stoping");
    }

    void status() {
        System.out.println("FLAC is runing at 937kps");
    }
    // you can se that Flac have common method play,stop like mp3
    // but other than that is not fixed

}

// ----------------------------------------------------------------------//

// Static variables and Method

// static int[] array1 = new int[] { 12, 56, 79, 12, 45, 22 };
// this is static that mean it global that all class can access to it
// and use value without needed to create new instance
// this will conflict to OOP consept

// ----------------------------------------------------------------------//

// OOP(Object-Orented Programming)
// java is using OOP to operate
// structure
// 1. Class -> it's like type of object
// 2. Object -> subset of the class
// 3. Encapsulation -> how we protect data and decide what data we can share
// (private, protected, public) <- this call Access modifier
// 4. Inheritance -> class can tranfer it's properties to other class
// 5. Polymorphism -> same method can cause different work
// 6. Abstraction -> show only neccesery thing in code