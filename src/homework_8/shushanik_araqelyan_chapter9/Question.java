package homework_8.shushanik_araqelyan_chapter9;

import java.util.Random;

public class Question {
    Random rand = new Random();

    int ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 30) {
            //  return NO;
            //  else  if(prob < 60)
            //  return YES;
            //else  if(prob < 75 )
            //      return LATER;
            // else if (prob < 98)
            //       return SOON;
            //  else
            //       return NEVER;
        }
    }
}
