package ClassesAndInterfaceses.api;

public class Body implements IBody{
    private String name;

    public void getName() {
        System.out.println("My name is "+name);
    }

    public Body(String name){
        this.name = name;
    }

    @Override
    public void getInfo() {

    }
}
