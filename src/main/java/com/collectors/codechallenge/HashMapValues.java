package com.collectors.codechallenge;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 * @author NaveenWodeyar
 *
 */
public class HashMapValues {

	public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        //Adding key-value pairs to HashMap
        map.put(1, "AAA");
        map.put(2, "BBB");
        map.put(3, "CCC");
        map.put(4, "DDD");
        map.put(5, "EEE");
        
        //Retrieving the Collection view of values present in map
        Collection<String> values = map.values();
        
      //Retrieving the Key Set
        Set<Integer> keySet = map.keySet();
	}

}
