package com.aceprogamming.kata.grasshopper.grades.average;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grasshopper {
    public static char getGrades(int x, int y, int z) {
        var stats = Stream.of(x, y, z).collect(Collectors.averagingInt(it -> it));
        return GradeValues.findForAverage(stats).toString().charAt(0);
    }

    enum GradeValues {
        F(0, 60),
        D(60, 70),
        C(70, 80),
        B(80, 90),
        A(90, 101);
        private final int startRangeInclusive;
        private final int endRangeExclusive;

        GradeValues(int startRangeInclusive, int endRangeExclusive) {
            this.startRangeInclusive = startRangeInclusive;
            this.endRangeExclusive = endRangeExclusive;
        }

        static GradeValues findForAverage(double average) {
            return Arrays.stream(GradeValues.values())
                    .filter(it -> ((average >= it.startRangeInclusive) && (average < it.endRangeExclusive))).
                    findFirst().orElseThrow();
        }
    }
}
