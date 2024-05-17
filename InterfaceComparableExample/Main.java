package InterfaceComparableExample;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            nums.add((int)(Math.random()*100 + 1));
        }
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);

        List<Student> comp2140list = new ArrayList<>();
        comp2140list.add(new Student("Isham"));
        comp2140list.add(new Student("Ananta"));
        comp2140list.add(new Student("Jessa"));
        comp2140list.add(new Student("Kylo"));
        comp2140list.add(new Student("Morrigan"));

        System.out.println(comp2140list);
        Collections.sort(comp2140list);
        System.out.println(comp2140list);
    }
}
