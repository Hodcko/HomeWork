package parts;

import api.ECPU;

public class CPU implements IParts{
    private Enum myPart;

    @Override
    public Enum getMyPart() {
        return myPart;
    }

    public CPU(ECPU myPart){
        this.myPart = myPart;
    }

    @Override
    public boolean isWork(){
        return true;
    }
}
