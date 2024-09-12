package homework_21.Roza_Petrosyan.chapter_29.recursive_task;

import java.util.concurrent.RecursiveTask;

public class Sum extends RecursiveTask {
    final int seqThresHold = 500;
    double[] data;
    int start, end;

    Sum(double[] vals, int s, int e) {
        data = vals;
        start = s;
        end = e;
    }

    protected Double compute() {
        double sum = 0;
        if((end - start) < seqThresHold) {
            for (int i = start; i < end; i++) {
                sum += data[i];
            }
        } else {
            int middle = (start + end) / 2;
            Sum subTaskA = new Sum(data, start, middle);
            Sum subTaskB = new Sum(data, middle, end);
            subTaskA.fork();
            subTaskB.fork();
            sum = (double) subTaskA.join() + (double) subTaskB.join();
        }
        return sum;
    }
}
