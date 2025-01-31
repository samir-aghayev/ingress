package annotationPraction;

import java.lang.reflect.Method;

public class AnnotationDetector {
    public static void main(String[] args) {
        detectAnnotation(MyClass.class);
    }


    public static void detectAnnotation(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            System.out.println("Method: " + method.getName() + " " + annotation.value());
        }
    }
}
