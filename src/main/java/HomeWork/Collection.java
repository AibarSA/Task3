package HomeWork;

import java.util.Set;
import java.util.TreeSet;

public class Collection {

    public static void main(String[] args) {

        Set<String> strings = new TreeSet<String>();

        for (int i = 0; i <args.length ; i++) {
            strings.add(args[i]);
        }

        System.out.println(strings);

    }
}
