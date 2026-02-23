package dev.xernas.atom.math;

import java.util.List;
import java.util.Set;

public class MathUtils {

    public static double average(double... values) {
        if (values.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }

    public static double average(List<Double> values) {
        if (values.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.size();
    }

    public static double average(Set<Double> values) {
        if (values.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.size();
    }

    public static float clamp(float value, float min, float max) {
        return Math.max(min, Math.min(max, value));
    }

    public static float lerp(float start, float end, float t) {
        return start + t * (end - start);
    }

}
