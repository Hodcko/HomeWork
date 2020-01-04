package parts;

import api.EHDD;

public class HDD implements IParts{
    private Enum myPart;

    @Override
    public Enum getMyPart() {
        return myPart;
    }

    public HDD(EHDD myPart){
        this.myPart = myPart;
    }


    @Override
    public boolean isWork(){
        return true;
    }
}
