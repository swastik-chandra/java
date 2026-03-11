package in.kgcoding.Collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add(" Swastik"));
        System.out.println(names.add(" Swayam"));
        System.out.println(names.add(" Java"));
          Utility.print(names);
        System.out.println(names.add(" Swastik"));
        System.out.println(names.size());
        Utility.print(names);
        System.out.println(names.contains(" Swastik"));
        System.out.println(names.remove(" Swastik"));
        System.out.println(names);
        System.out.println(names.remove(" Swastik"));





    }
}
