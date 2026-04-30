package com.deven;

public class Q4 {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public boolean isWeekend() {
            return this == SATURDAY || this == SUNDAY;
        }

        public boolean isWeekday() {
            return !isWeekend();
        }
    }

    public static void main(String[] args) {
        for (Day d : Day.values()) {
            System.out.println(d + " " + d.isWeekend() + " " + d.isWeekday());
        }
    }
}
