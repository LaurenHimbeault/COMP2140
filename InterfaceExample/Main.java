package InterfaceExample;

public class Main {
    public static void main(String[] args) {
        PrintableList mpl = new MarathonParticipantList();
        mpl.add("Jessa", 10);
        mpl.add("Marvin", 5);
        mpl.add("Ananata", 10);
        mpl.add("Isham", 15);

        PrintableList cl = new CourseList();
        cl.add("COMP 1010", 100);
        cl.add("COMP 1020", 30);
        cl.add("COMP 2140", 110);

        printAll(mpl);
        printAll(cl);

    }
    public static void printAll(PrintableList list) {
        list.printData();
    }
}