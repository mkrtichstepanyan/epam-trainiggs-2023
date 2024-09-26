package homework_19.Roza_Petrosyan.chapter_15.instance_method_reference_with_different_objects;

public class HighTemp {
    private int hTemp;
    HighTemp(int ht) {
        hTemp = ht;
    }

    boolean sameTemp(HighTemp ht2){
        return hTemp == ht2.hTemp;
    }

    boolean lessThanTemp(HighTemp ht2){
        return hTemp < ht2.hTemp;
    }
}
