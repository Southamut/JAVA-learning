import java.lang.classfile.instruction.StackInstruction;

public class oop_access_modifier {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Mew", "Scott", 4);
        cat1.call();
        // System.out.println(cat1.name); // system can not see the value of name

        // if want to change name -> use edit method
        cat1.editName("Maw");

    }
}

class Cat {
    // properies
    private String name;
    private String breed;
    private int age;
    // put private to prevent access from outer class
    // that mean you can't event print these value outside Cat class without using
    // public medthod

    Cat(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        showStatus();// you also an call method in class like this
    }

    // method

    // this is how we access and edit private value
    // we need to create edit method
    public void editName(String newName) {
        String oldName = this.name;
        this.name = newName;
        System.out.println(oldName + " is canged to " + this.name);
    }

    // void is return type
    public void call() {
        System.out.println("Meow!");
    }

    public void run() {
        System.out.println(this.name + " is running");
    }

    public void sleep() {
        System.out.println(this.name + " is sleeping");
    }

    private void showStatus() {
        System.out.println("Name: " + this.name);
        System.out.println("Breed: " + this.breed);
        System.out.println("Age: " + this.age);
    }
}
