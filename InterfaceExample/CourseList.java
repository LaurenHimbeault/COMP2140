package InterfaceExample;

import java.util.*;

public class CourseList implements PrintableList {
    private static int curr_id = 0;
    private ArrayList<Integer> courseIds;
    private ArrayList<String> courseNames;
    private ArrayList<Integer> courseCapacities;
    
    public CourseList() {
        courseIds = new ArrayList<>();
        courseNames = new ArrayList<>();
        courseCapacities = new ArrayList<>();
    }

    public void add(String name, int cap) {
        if(!courseNames.contains(name)) {
            courseIds.add(curr_id); 
            curr_id++;
            courseNames.add(name);
            courseCapacities.add(cap);
        }
    }

    private int size() {
        return courseIds.size();
    }

    public void printData() {
        System.out.println("Available Course List");
        System.out.printf("%15s %15s %15s%n", "Course ID", "Course Name", "Capacity");
        System.out.printf("%15s %15s %15s%n","---------","-----------","--------");
        for(int i = 0; i < this.size(); i++) {
            System.out.printf("%15d %15s %15d%n", this.courseIds.get(i), this.courseNames.get(i), this.courseCapacities.get(i));
        }
    }

}
