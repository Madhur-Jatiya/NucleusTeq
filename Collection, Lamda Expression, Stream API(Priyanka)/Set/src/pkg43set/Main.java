package pkg43set;

import LinkedSet.LinkedHashsetExample;
import Hashset.HashsetExample;
import TreeSet.TreeSetExample;

public class Main {

    public static void main(String[] args) {
        System.out.println("\t\t\tHashSet");
        HashsetExample hashsetExample = new HashsetExample();
        hashsetExample.hashSet1();
        hashsetExample.hashSet2();
        hashsetExample.hashSet3();

        System.out.println("\n\n\t\t\tLinked HashSet");
        LinkedHashsetExample linkedHashsetExample = new LinkedHashsetExample();
        linkedHashsetExample.LinkedHashSet1();
        linkedHashsetExample.LinkedHashSet2();

        System.out.println("\n\n\t\t\t TreeSet");
        TreeSetExample treeSetExample = new TreeSetExample();
        treeSetExample.treeSet1();
        treeSetExample.treeSet2();
//        treeSetExample.treeSet3();
    }

}
