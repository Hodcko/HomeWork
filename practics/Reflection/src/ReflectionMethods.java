import java.awt.image.ImageConsumer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionMethods {

    public void showClass(Object object){
        Class clazz = object.getClass();
        System.out.println(clazz.getName());
    }

    public void showClassFields(Object object){
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }

    public void showClassMethods(Object object){
        Class clazz = object.getClass();
        Method [] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }

    public void showClassConstructors(Object object){
        Class clazz = object.getClass();
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(clazz.getName() + ": " + constructor.getName());
        }
    }

    public void showClassFieldsAnnotations(Object object){
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
           Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(field.getName() + ": " + annotation.toString());
            }
        }
    }

    public void showClassMethodsAnnotations(Object object){
        Class clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(method.getName() + ": " + annotation.toString());
            }
        }
    }

    public void fillPriveteFields(Object object) throws IllegalAccessException {
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
           Annotation annotation = field.getAnnotation(Deprecated.class);
           if(annotation == null){
               continue;
           }
           field.setAccessible(true);
           field.set(object, "TestName");
            field.setAccessible(false);
        }
    }

    public Object createNewObject(Object object) throws IllegalAccessException, InstantiationException {
        Class clazz = object.getClass();
        return clazz.newInstance();
    }
}
