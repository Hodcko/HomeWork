package ClassesAndInterfaceses.api;

public class Head implements IHead{
    String typeOfYeyes;

    public String getTypeOfYeyes() {
        return typeOfYeyes;
    }

    public Head(String typeOfYeyes){
        this.typeOfYeyes = typeOfYeyes;
    }


    @Override
    public void look() {

    }
}
