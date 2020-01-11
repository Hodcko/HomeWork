package api;

public interface IStandart {
    IStandart[] standarts = new IStandart []{ERAM.DDR4, ECPU.INTEL, EHDD.SATA};
    IStandart[] gamingStandarts = new IStandart []{ERAM.DDR4, ECPU.AMD, EHDD.NVME};
    IStandart[] officeStandarts = new IStandart []{ERAM.DDR3, ECPU.SNAPDRAGON, EHDD.M2};
}
