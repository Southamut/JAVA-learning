public class variable_and_operator {
    // Type
    public static void main(String[] args) {
        int age = 20;
        double high = 150.6;// if its big decimal use double
        float workTime = 7.8f;// if it's small decimal use float and put f backward
        boolean real = true;
        if (real) {
            System.out.println("Hello this is JAVA" + " " + age + " " + "H" + " " + high * workTime);
        }
        calculate(args);
    }

    // Operator
    // we have Casting that will change type of num to bigger type automatically
    public static void calculate(String[] args) {
        int num1 = 7;
        int num2 = 3;
        float num3 = 5;

        // auto casting
        var num4 = num1 / num3;// we can use float insteed of var because we know that it will going to be
                               // float, if using int it will error
        System.out.println("num4 will turn to float " + num4);

        // force casting
        float num5 = (float) (num1 + num2);
        System.out.println("num5 will turn to float insteed of int " + num5);
    }
}

// How JAVA run
// 1. source code (.java)
// -> 2.complier (javac) that install in your PC
// [when edit .java you need to comply everytime to update .class]
// -> 3. byte code (.class) auto gen when run .java
// -> 4. JVM
// -> 5. output

// OOP(Object-Orented Programming)
// java is using OOP to operate
// structure
// 1. Class -> it's like type of object
// 2. Object -> subset of the class
// 3. Encapsulation -> how we protect data and decide what data we can share
// (private, protected, public)
// 4. Inheritance -> class can tranfer it's properties to other class
// 5. Polymorphism -> same method can cause different work
// 6. Abstraction -> show only neccesery thing in code