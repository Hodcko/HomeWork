public class ReflectionMain {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ReflectionMethods checker = new ReflectionMethods();
        Test test = new Test();

        checker.showClass(test);
        checker.showClassFields(test);
        checker.showClassMethods(test);
        checker.showClassFieldsAnnotations(test);
        checker.showClassMethodsAnnotations(test);
        checker.showClassConstructors(test);

        checker.fillPriveteFields(test);// получения доступа к приватному полю класса
        System.out.println(test.getTestName());

        Object myObject = checker.createNewObject(test); // создание объекта класса
        checker.showClass(myObject);


    }
}
