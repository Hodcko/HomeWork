
public class ClassesAndObjects {
    public static void main(String[] args) {
        Human person1 = new Human("John", 20);
        System.out.println(person1.getAge());



    }

    public static class Human{
        private  String name;
        private int age;

        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public void talk(){
            System.out.println("My name is "+ name +", I am "+ age + " years old");
        }


    }
}
