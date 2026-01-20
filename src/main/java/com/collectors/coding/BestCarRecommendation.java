package com.collectors.coding;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

class Car {
    String name;
    int safetyRating;   // 1 to 5 (Bharat/Global NCAP)
    int featureScore;   // 1 to 10 (Tech & Comfort)
    int resaleScore;    // 1 to 10 (Resale Value)
    int brandTrust;     // 1 to 10 (Brand Reputation)

    public Car(String name, int safetyRating, int featureScore, int resaleScore, int brandTrust) {
        this.name = name;
        this.safetyRating = safetyRating;
        this.featureScore = featureScore;
        this.resaleScore = resaleScore;
        this.brandTrust = brandTrust;
    }

    public int getTotalScore() {
        // Weighted sum: Safety more important
        return (safetyRating * 4) + (featureScore * 3) + (resaleScore * 2) + brandTrust;
    }
}

public class BestCarRecommendation {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        // Add car data (example values)
        cars.add(new Car("Tata Nexon", 5, 8, 9, 8));        // high safety + high resale :contentReference[oaicite:0]{index=0}
        cars.add(new Car("Hyundai i20", 4, 9, 7, 8));        // premium hatch, good features :contentReference[oaicite:1]{index=1}
        cars.add(new Car("Maruti Suzuki Dzire", 5, 7, 8, 9)); // 5-star safety & great resale :contentReference[oaicite:2]{index=2}
        cars.add(new Car("Mahindra XUV300", 5, 8, 7, 7));    // strong safety & features :contentReference[oaicite:3]{index=3}
        cars.add(new Car("Tata Harrier EV", 5, 9, 6, 7));   // safe + EV features :contentReference[oaicite:4]{index=4}
        cars.add(new Car("Skoda Kylaq", 5, 8, 6, 7));        // 5-star safety EU standards :contentReference[oaicite:5]{index=5}

        // Sort by total score descending
        cars.sort((c1, c2) -> c2.getTotalScore() - c1.getTotalScore());

        System.out.println("🏆 Best car recommendations in Bangalore (Safety, Features, Resale, Brand):");
        for (Car car : cars) {
            System.out.printf("%s (Total Score: %d, Safety: %d/5, Features: %d/10, Resale: %d/10, Brand: %d/10)%n",
                car.name, car.getTotalScore(), car.safetyRating, car.featureScore, car.resaleScore, car.brandTrust);
        }
    }
}
