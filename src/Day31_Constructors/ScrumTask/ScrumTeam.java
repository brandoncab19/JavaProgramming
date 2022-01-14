package Day31_Constructors.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO, BA, SM;
    ArrayList<Tester> testerList = new ArrayList<>();
    ArrayList<Developer> developerList = new ArrayList<>();
    int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(Tester tester){
        testerList.add(tester);
    }

    public void addTesters(Tester[] testers){
        testerList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        developerList.add(developer);
    }

    public void addDevelopers(Developer[] developers){
        developerList.addAll(Arrays.asList(developers));
    }
    
    public void removeTester (long employeeID){
        testerList.removeIf(p-> p.employeeID == employeeID);
    }

    public void removeDeveloper (long employeeID){
        developerList.removeIf(p-> p.employeeID == employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of tester=" + testerList.size() +
                ", total number of developers=" + developerList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
