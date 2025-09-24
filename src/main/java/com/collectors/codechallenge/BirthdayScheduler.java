package com.collectors.codechallenge;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */


public class BirthdayScheduler {

    public static void main(String[] args) {
        Calendar birthday = Calendar.getInstance();
        birthday.set(Calendar.MONTH, Calendar.SEPTEMBER); // Month is 0-based (0 = Jan)
        birthday.set(Calendar.DAY_OF_MONTH, 25);
        birthday.set(Calendar.HOUR_OF_DAY, 9);
        birthday.set(Calendar.MINUTE, 0);
        birthday.set(Calendar.SECOND, 0);

        Timer timer = new Timer();

        // If the birthday this year is already passed, schedule for next year
        if (birthday.getTime().before(new Date())) {
            birthday.add(Calendar.YEAR, 1);
        }

        TimerTask birthdayTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("🎉 Happy Birthday! 🎂");

                // Reschedule for next year
                birthday.add(Calendar.YEAR, 1);
                timer.schedule(new BirthdayScheduler().new BirthdayWishTask(), birthday.getTime());
            }
        };

        timer.schedule(birthdayTask, birthday.getTime());
    }

    class BirthdayWishTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("🎉 Happy Birthday! 🎂");

            // Schedule again for next year
            Calendar nextBirthday = Calendar.getInstance();
            nextBirthday.setTime(new Date());
            nextBirthday.add(Calendar.YEAR, 1);
            nextBirthday.set(Calendar.MONTH, Calendar.SEPTEMBER);
            nextBirthday.set(Calendar.DAY_OF_MONTH, 25);
            nextBirthday.set(Calendar.HOUR_OF_DAY, 9);
            nextBirthday.set(Calendar.MINUTE, 0);
            nextBirthday.set(Calendar.SECOND, 0);

            new Timer().schedule(new BirthdayWishTask(), nextBirthday.getTime());
        }
    }
}
