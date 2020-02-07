public class LambdasMain3 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Tom");
        FunkInter3<Person> funkInter3 = (e) -> {
            if(e.getName().equals("Tom")){
                return false;
            }
            return true;
        };
        System.out.println(funkInter3.filter(person));

    }
}
