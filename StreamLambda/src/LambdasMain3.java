public class LambdasMain3 {
    public static void main(String[] args) {
        Persons person = new Persons();
        person.setName("Tom");
        FunkInter3<Persons> funkInter3 = (e) -> {
            if(e.getName().equals("Tom")){
                return false;
            }
            return true;
        };
        System.out.println(funkInter3.filter(person));

    }
}
