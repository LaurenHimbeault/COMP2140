package InterfaceExample;

import java.util.ArrayList;

public class MarathonParticipantList implements PrintableList {
    private static int runners_id = 0;
    private ArrayList<String> names;
    private ArrayList<Integer> numKMRace;
    private ArrayList<Integer> runnerIds;

    public MarathonParticipantList() {
        names = new ArrayList<>();
        numKMRace = new ArrayList<>();
        runnerIds = new ArrayList<>();
    }
    public void add(String name, int km) {
        int id = runners_id;
        // duplication is fine for ease, this is not realistic
        runners_id++;
        names.add(name);
        runnerIds.add(id);
        numKMRace.add(km);
    }

    private int size() {
        return runnerIds.size();
    }

    public void printData() {
        System.out.println("Marathon Participant List");
        System.out.printf("%15s %15s %15s%n", "Runner ID", "Runner Name", "KM Race");
        System.out.printf("%15s %15s %15s%n","---------","-----------","-------");
        for(int i = 0; i < this.size(); i++) {
            System.out.printf("%15d %15s %15d%n", this.runnerIds.get(i), this.names.get(i), this.numKMRace.get(i));
        }
    }

}
