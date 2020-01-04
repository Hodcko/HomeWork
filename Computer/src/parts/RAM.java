package parts;


import api.ERAM;

public class RAM implements IParts {
    private Enum myPart;

    @Override
    public Enum getMyPart() {
        return myPart;
    }


    public RAM(ERAM myPart){
        this.myPart = myPart;
    }


    @Override
    public boolean isWork(){
        return true;
    }

}
