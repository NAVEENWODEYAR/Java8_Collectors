package com.collectors.java17;

import java.util.random.RandomGenerator;


/**
 * @author NaveenWodeyar
 *
 */
public class RandomGeneratorExample {

	public static void main(String[] args) {
        RandomGenerator random = RandomGenerator.of("L64X128MixRandom");
        System.out.println("Random int: " + random.nextInt());
        System.out.println("Random long: " + random.nextLong());
    }
}
