import java.lang.reflect.Method;

class Ex39_CommunityCourse {
    public void printDetails() {
        System.out.println("Community Course: Java Basics");
    }
}
class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Ex39_CommunityCourse");
        System.out.println("Class: " + clazz.getSimpleName());

        Object object = clazz.getDeclaredConstructor().newInstance();
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println("Method: " + method.getName());
            method.invoke(object);
        }
    }
}

