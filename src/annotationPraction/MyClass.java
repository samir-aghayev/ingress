package annotationPraction;

import annotation.MyCustom;

public class MyClass {
    @MyAnnotation(value = "Hello")
    public void myMethod(){
        System.out.println("My method executed" );
    }
}
