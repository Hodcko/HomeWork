import api.IStandart;
import parts.IParts;
import sun.jvm.hotspot.debugger.win32.coff.COMDATSelectionTypes;
import sun.tools.jconsole.inspector.IconManager;

import javax.swing.plaf.synth.SynthComboBoxUI;

public class ComputerMain{
    public static void main(String[] args) {
        Computer myComp = new Computer(IParts.parts, IStandart.standarts);
        myComp.start();

        Director director = new Director();

        director.setBuilder(new OfficePC());
        Computer gamingComputer = director.buildComputer();
        gamingComputer.start();

        director.setBuilder(new GamingPC());
        Computer officeComputer = director.buildComputer();
        officeComputer.start();

    }
}
