package parts;

import api.ECPU;
import api.EHDD;
import api.ERAM;

public interface IParts {
    boolean isWork();
    Enum getMyPart();
    IParts myCPU = new CPU(ECPU.INTEL);
    IParts myHDD = new HDD(EHDD.SATA);
    IParts myRAM = new RAM(ERAM.DDR4);
    IParts [] part = new IParts[]{myCPU, myHDD, myRAM};







}
