package parts;

import api.ECPU;
import api.EHDD;
import api.ERAM;
import api.IStandart;

public interface IParts {
    boolean compatible(IStandart[] standarts);
    boolean isWork();
    Enum getMyPart();
    IParts myCPU = new CPU(ECPU.INTEL);
    IParts myHDD = new HDD(EHDD.SATA);
    IParts myRAM = new RAM(ERAM.DDR4);
    IParts [] parts = new IParts[]{myCPU, myHDD, myRAM};

}
