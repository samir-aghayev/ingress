package lambda.easy;
/*
 * Task 6: Custom Functional Interface for Greeting Instructions:
 * Create a custom functional interface Greeter with a method greet(String name).
 * Implement it using a lambda expression to print a personalized greeting for a name.
 */

public class CustomFunctionalInterfaceForGreeting {
    public static void main(String[] args) {
        Greeting greeting = name -> System.out.println("Hello " + name);
        greeting.greet("Random name1");
        greeting.greet("Random name2");
        greeting.greet("Random name3");
        greeting.greet("I am not narcissist ;)");
    }
}


interface Greeting {
    void greet(String name);
}

