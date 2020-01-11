package api;

import parts.CPU;
import parts.HDD;
import parts.RAM;

public interface IParts {
    boolean compatible(IStandart[] standarts);
    boolean isWork();
    Enum getMyPart();
    IParts myCPU = new CPU(ECPU.INTEL);
    IParts myHDD = new HDD(EHDD.SATA);
    IParts myRAM = new RAM(ERAM.DDR4);
    IParts [] parts = new IParts[]{myCPU, myHDD, myRAM};

}
