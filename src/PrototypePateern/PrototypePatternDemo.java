package PrototypePateern;

import java.util.ArrayList;
import java.util.List;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache sc = new ShapeCache();
        sc.loadCache();
        Shape copy = sc.getShape("1");

        Shape original = sc.getShapeMap().get("1");
        List<String> str1 = new ArrayList<>();
        str1.add("a");
        List<String> str2 = new ArrayList<>();
        str2.add("b");
        copy.addList(str1);
        original.addList(str2);
        // shallow copy result
        System.out.println(copy.lists[0].get(0));
        System.out.println(original.lists[0].get(0));
    }
}
