public class Operators {
    
    public static void main(String[] args) {
        // An operator is a symbol that tells Java to perform some operation
        int a1 = 10;
        int b1 = 5;
        int result = a1 + b1;  // + tells Java to add a and b
        // The values/variables on which an operator works are called operands

        // TYPES OF OPERATORS:
        // │
        // ├── 1. Arithmetic
                // +     Addition
                // -     Subtraction
                // *     Multiplication
                // /     Division [It gives quotient]
                // %     Modulus [It gives reminder]
        int a = 10;
        int b = 3;
        System.out.println(a + b); // 13
        System.out.println(a - b); // 7
        System.out.println(a * b); // 30
        System.out.println(a / b); // 3
        System.out.println(a % b); // 1
        //NOTE: int / int → int    double / double → double

        // ├── 2. Unary [An operator that works on one operand]
                // +     Unary +
                // -     Unary -
                // ++    Post & Pre Increment
                // --    Post & Pre Decrement
                // !     Logical not
                // ~     Bitwise not
        int x = 10;
        int y = +x;
        int z = -x;
        int w = y++;
        int u = z--;

        // ├── 3. Assignment 
                // =
                // +=
                // -=
                // *=
                // /=
                // %=

        // ├── 4. Relational [They produce a boolean result]
                // ==    Equal to
                // !=    Not equal to
                // >     Greater than
                // <     Less than
                // >=    Greater than or equal to
                // <=    Less than or equal to
        int a2 = 10;
        double b2 = 10.0;
        char c3 = 'A';
        boolean rel = a2 == b2; // true
        boolean rel1 = a2 == c3;// false
        System.out.println(rel+" "+ rel1);
//When Java compares numeric values of different types, the int is promoted to double

        // ├── 5. Logical
                // &&    AND
                // ||    OR
                // !     NOT

        // ├── 6. Bitwise  [These work at the individual binary-bit]level
                // &     AND
                // |     OR
                // ^     XOR // Diff. bits => 1 // Same bits => 0
                // ~     NOT
        int num1 = 5; // 5 → 0101
        int num2 = 3; // 3 → 0011
        System.out.println(num1 & num2); // 0101 & 0011 => 0001

        // ├── 7. Shift  [Shift operators move bits left or right]
                // <<    Left shift   //For positive numbers: x << n ≈ x × 2ⁿ
                // >>    Signed right shift   //For positive numbers, you can roughly think: x >> n ≈ x / 2ⁿ
                // >>>   Unsigned right shift
        System.out.println(5 << 1); // BINARY:5 = 0101 //Shift left:1010 which is 10 // So: 5<<1 = 10

        // ├── 8. Ternary  [The ternary operator is a short form of a simple if-else]
                //SYNTAX: condition ? valueIfTrue : valueIfFalse;
        int age = 20;
        String res = age >= 18 ? "Adult" : "Minor";

        // └── 9. instanceof  [instanceof checks whether an object is an instance of a particular type]
        String name = "Parth";
        System.out.println(name instanceof String);
        //instanceof is about reference types/objects, not primitive types
        // int x = 10;
        // x instanceof int // error
    }
}
