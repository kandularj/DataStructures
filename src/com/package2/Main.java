package com.package2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //check MainImplementation for whole main code
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Roja");
        map.put(2,"Gopi");
        map.put(3,"floofy");
        map.containsKey(3); //O(1)
        map.containsValue("Gopi"); //O(n)
        System.out.println(map);

    }
}
