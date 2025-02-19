package annotationPraction;

import java.lang.reflect.Method;

public class AnnotationDetector {
    public static void main(String[] args) {
        detectAnnotation(MyClass.class);
    }


    public static void detectAnnotation(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
                System.out.println("Method: " + method.getName() + ", has annotation: " + annotation.value());
            }else {
                System.out.println("Method: " + method.getName() + ", has not annotation");
            }
        }
    }
}
