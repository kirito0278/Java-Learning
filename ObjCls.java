class Student {

    String name;
    int age;

    void study() {
        System.out.println(name + " is studying");
    }

    void introduce() {
            System.out.println("My name is " + name);
    }
}

public class ObjCls {
    // OOP = Object-Oriented Programming
    // It is a way of writing programs by organizing code around objects
    // Think about the real world: Car, Bank Account, Student, Mobile, Phone, Dog. These are all objects.
    // Each object has two important things:
    // 1. Properties / Data [Example: Acar has color, brand, speed, model]
    // 2. Beahavior / Action [Start, Stop, Accelerate, Brake]



    // An object is an entity that has: State + Behavior
    // Example: Student  // A student can have:
    // State (data/properties): Name = Parth, Age = 20, Course = CSE
    // Behavior (actions):study(), sleep(), attendClass()
    // In Java: Student s1 = new Student();
    // Here: s1 → Object / reference variable,  
    //       Student → Class / data type, 
    //       new Student() → Creates an object



// | Term               | Meaning                           |
// | ------------------ | --------------------------------- |
// | Class              | Blueprint/template                |
// | Object             | Instance of a class               |
// | Field              | Variable inside a class           |
// | Method             | Function inside a class           |
// | State              | Current data of an object         |
// | Behavior           | Actions performed by an object    |
// | Reference Variable | Variable that refers to an object |
// | `new`              | Creates a new object              |



    // A class is a blueprint or template used to create objects.
    // For example, imagine we want to represent students.A class defines what information and behavior every student should have.
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Parth";
        s1.age = 20;
        s2.name = "Rahul";
        s2.age = 21;

        s1.introduce();
        s2.introduce();
        s1.study();
    }
}
