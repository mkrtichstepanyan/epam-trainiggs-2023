package homework_3.Rafik_Pahlevanyan.tasks;

public class Task_1 {

    public static void main(String[] args) {
        drawLeftUpTriangle(5);
        drawRightUpTriangle(5);
        drawLeftBottomTriangle(5);
        drawRightBottomTriangle(5);
        drawRhombus(5);
        drawIsoscelesTriangle(5);
        drawBottomIsoscelesTriangle(5);

    }

    /*
         Draws the triangle by specified length number
         for example when n = 4 , it must be such as
         drawn below :
          *
          * *
          * * *
          * * * *
         @param length specified length of triangle will be drawn
    */
    public static void drawLeftUpTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /*   Draws the triangle by specified length number
         for example when n = 5 , it must be such as
         drawn below :
                 *
               * *
             * * *
           * * * *
         * * * * *

       @param length specified length of triangle will be drawn
    */
    public static void drawRightUpTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = length; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


/*     Draws the triangle by specified length number
       for example when n = 4 , it must be such as
       drawn below :
       <p>
             * * * *
             * * *
             * *
             *
    @param length specified length of triangle will be drawn
*/

    public static void drawLeftBottomTriangle(int length) {
        for (int i = length; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /*   Draws the triangle by specified length number
         for example when n = 4 , it must be such as
         drawn below :
         <p>
                * * * *
                  * * *
                    * *
                      *

         @param length specified length of triangle will be drawn
  */
    public static void drawRightBottomTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = length; k > i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /*   Draws the rhombus by specified length number
         for example when n = 5 , it must be such as
         drawn below :
         <p>
                *
               * *
              * * *
             * * * *
              * * *
               * *
                *

       @param length specified length of rhombus will be drawn
   */
    public static void drawRhombus(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = length; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >= 0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = length; k > i; k--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }


    /*     length = 5
                     *
                   * * *
                 * * * * *
               * * * * * * *
             * * * * * * * * *

          @param length specified length of triangle will be drawn
      */
    public static void drawIsoscelesTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = length - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /*        * * * * * * * * *
               * * * * * * *
                 * * * * *
                   * * *
                     *

          @param length specified length of triangle will be drawn
      */
    public static void drawBottomIsoscelesTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print("  ");
            }
            for (int k = length + 2; k >= (2 * i - 1); k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
