import java.util.Arrays;

public class control_flow {
    public static void main() {
        ifElseFunction();
        caseFunction();
        caseFunctionYeild();
        forLoopFunc();
        whileLoopFunc();
        arraAssign(array1);
        ternaryFunc(array1);

    }

    // if else look like other lang
    public static void ifElseFunction() {
        int num = 7;
        if (num > 7) {
            System.out.println("it's over 7");
        } else if (num == 7) {
            System.out.println("it's 7");
        } else {
            System.out.println("it's lower than 7");
        }
    }

    // switch case using like JS and GO
    public static void caseFunction() {
        int day = 4;
        // Arrow syntax
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Thurseday");
                break;
            default:
                System.out.println("other day");
                break;
        }
    }

    // switch expression with yeild
    public static void caseFunctionYeild() {
        int day = 6;
        // Arrow syntax
        switch (day) {
            case 1, 2, 3, 4, 5:
                System.out.println("Workday");
                break;
            case 6, 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("other day");
                break;
        }
    }

    // _______________________________________________________//

    // Loop
    // for loop
    public static void forLoopFunc() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("this is loop " + (i + 1) + ", sub loop " + (j + 1));
            }
        }
    }
    // for loop you can use continue and brake to operate
    // contine will skip the loop if condition was true but still do until lat loop
    // break will stop the loop imidiatly if condition was true

    // while loop
    public static void whileLoopFunc() {
        int n = 0;
        while (n < 3) {
            System.out.println("this is while loop " + (n + 1));
            n++;
        }
    }

    // __________________________________________________________//

    // Array
    static int[] array1 = { 12, 56, 79, 12, 45, 22 }; // use static to make this value can call in main
    static int[] array2 = new int[5]; // this is how to ceate new blank array

    public static void arraAssign(int[] args) {
        int[] newArray = args.clone(); // this will copy array from input insteed of make it be the same value
        newArray[5] *= 2;
        newArray[1] = 72;
        System.out.println(
                "New array is " + Arrays.toString(newArray) + " it has length " + newArray.length
                        + ", and this is original array " + Arrays.toString(args));
        // need Arrays.toString to make it display value in string
    }

    // Ternary Operator
    public static void ternaryFunc(int[] args) {
        // type of isTrue will depend on vlue of it's ternary component
        String status = (args.length < 3) ? "True" : "False";
        System.out.println("Status: " + status);
    }

}
