package homework_14.anna_manukyan.chapter_14;

public class Stats<T extends Number> {
    T[] nums;

    Stats(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    boolean isSameAvg(Stats<?> ob) {
        if (average()==ob.average()) {
            return true;
        }
        return false;
    }
}