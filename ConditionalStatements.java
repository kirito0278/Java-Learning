public class ConditionalStatements {
    
    public static void main(String[] args) {
        // A conditional statement allows your program to make a decision
        // A condition is usually an expression that produces a boolean
        // Types of Conditional Statements:
        // │
        // ├── if
        // ├── if-else
        // ├── if-else-if
        // ├── nested if
        // └── switch

        int marks = 85;

        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 80) {
            System.out.println("B");
        } else if (marks >= 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }

        // switch (expression) {
        //     case value1:
        //         // code
        //         break;
        //     case value2:
        //         // code
        //         break;
        //     default:
        //         // code
        //     }
    }
}
