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

    IParts gamingCPU = new CPU(ECPU.AMD);
    IParts gamingHDD = new HDD(EHDD.NVME);
    IParts gamingRAM = new RAM(ERAM.DDR4);

    IParts officeCPU = new CPU(ECPU.SNAPDRAGON);
    IParts officeHDD = new HDD(EHDD.M2);
    IParts officeRAM = new RAM(ERAM.DDR3);

    IParts [] parts = new IParts[]{myCPU, myHDD, myRAM};
    IParts [] officeParts = new IParts[]{officeCPU, officeHDD, officeRAM};
    IParts [] gamingParts = new IParts[]{gamingCPU, gamingHDD, gamingRAM};
}
