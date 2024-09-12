package homework_21.Roza_Petrosyan.chapter_29.phaser_onAdvance;

import java.util.concurrent.Phaser;

public class MyPhaser extends Phaser {
    int numPhases;

    MyPhaser(int parties, int phaseCount) {
        super(parties);
        numPhases = phaseCount - 1;
    }

    protected boolean onAdvance(int p, int regParties) {
        System.out.println("Phase " + p + " completed.\n");
        return p == numPhases || regParties == 0;
    }
}
