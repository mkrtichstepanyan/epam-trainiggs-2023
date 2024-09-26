package homework_19.Roza_Petrosyan.chapter_15.instance_method_reference_with_different_objects;

public class InstanceMetWithObjectRefDemo {
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], v)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count;
        HighTemp[] weekDayHights = {
                new HighTemp(89), new HighTemp(82),
                new HighTemp(90), new HighTemp(89),
                new HighTemp(89), new HighTemp(91),
                new HighTemp(84), new HighTemp(83),
        };
        count = counter(weekDayHights, HighTemp::sameTemp, new HighTemp(89));
        System.out.println(count + " days had a hight oof 89");

        HighTemp[] weekDayHights2 = {
                new HighTemp(32), new HighTemp(12),
                new HighTemp(24), new HighTemp(19),
                new HighTemp(18), new HighTemp(12),
                new HighTemp(-1), new HighTemp(13),
        };
        count = counter(weekDayHights2, HighTemp::sameTemp, new HighTemp(12));
        System.out.println(count + " days had a hight of 12");

        count = counter(weekDayHights, HighTemp::lessThanTemp, new HighTemp(89));
        System.out.println(count + " days had a hight less of 89");
        count = counter(weekDayHights2, HighTemp::lessThanTemp, new HighTemp(19));
        System.out.println(count + " days had a hight less of 19");
    }
}
