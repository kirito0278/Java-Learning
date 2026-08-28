public class Hello {
    public static void main(String args[]) {
        System.out.println("Hello World!!");

        // Variable: A variable is a named storage location used to store a value in a program.
        // Syntax: dataType variableName = value;
        int age = 20;// EXAMPLE
        System.out.println(age);




        // Data Types: It specifies what kind of value a variable can store.
        // Java data types are broadly divided into:
        // A.PRIMITIVE: 1.Integer[byte(1byte), short(2byte), long(8byte), int(4byte)]  2.Floating[float, double]  3.Character[char]  4.Boolean[boolean]
        int in = 432;
        byte by = 21;
        short sh = 213;
        long l = 2342l;
        float f = 6.5f;
        double d = 6.43;
        char c = 'k';
        boolean b = true; //EXAMPLE
        // B.NON-PRIMITIVE / REFERENCE




        // Literal: It is a fixed value written directly in Java source code
        // 1. Integer Literals [whole num value (and for long use l)]
        // 2.Floating-point literals [decimal value( for float use f)]
        // 3.Character literals [one character]
        // 4.String literals [text enclosed in double quote]
        // 5.Boolean literals
        // 6.null literal [means a reference variable currently refers to no object, null can only be usedd with reference type]
        String name = null;
        // 7. Number system literals [binnary(prefix 0b), hexadecimal(prefix 0x), octal(prefix 0)]
        int num =-0b1111101; //for -ve values
        int num1 =-0x23D;
        int num2 = -0323;
        System.out.println(num+" "+num1+" "+num2);
        // NOTE- Java allows _ inside numeric literals to make large numbers easier to read
        int population = 1_000_000_000;




        // TYPE CONVERSION: It is the process of converting a value from one data type to another data type.There are two major forms:
        // 1.Widening Conversion- Converting from a type to a broader numeric type.It is generally performed automatically.
        byte a = 10;
        int b1 = a;
        long c1 = b1;
        double d1 = c1; //OUTPUT: 10 → 10.0
        // 2.Narrowing Conversion- Converting from a broader numeric type to a narrower type.It generally requires explicit casting.
        double x = 10.5;
        int y = (int) x; //OUTPUT:10

        // Type casting is explicit conversion of a value to another compatible type using (type).
        //syntax: (targetType) value; 

        // When Java performs an operation involving different numeric types, it may automatically convert the smaller type into a larger type before doing the operation(arithmetic). This is called TYPE PROMOTION.
        // --Basic Rules: byte, short, and char
        // During most arithmetic operations:
        //       byte  → int
        //       short → int
        //       char  → int
        //       byte + byte   → int
        //       byte + short  → int
        //       short + short → int
        //       char + byte   → int
        //       char + short  → int
        //       char is promoted to int in arithmetic
        //       int + long → long
        //       int + float → float
        //       int + double → double
    }
}
