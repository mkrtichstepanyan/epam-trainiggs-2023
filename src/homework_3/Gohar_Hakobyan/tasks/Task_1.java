package homework_3.Gohar_Hakobyan.tasks;

public class Task_1 {

    public static void main(String[] args) {
//        drawLeftUpTriangle(10);
//        drawRightUpTriangle(10);
//        drawLeftBottomTriangle(10);
//        drawRightBottomTriangle(10);
//        drawRhombus(10);
//        drawIsoscelesTriangle(10);
//        drawBottomIsoscelesTriangle(10);

    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *      *
     *      * *
     *      * * *
     *      * * * *
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawLeftUpTriangle(int length) {
        // TODO : complete the method
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 5 , it must be such as
     * drawn below :
     *             *
     *           * *
     *         * * *
     *       * * * *
     *     * * * * *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawRightUpTriangle(int length) {
        // TODO : complete the method
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



    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *
     *       * * * *
     *       * * *
     *       * *
     *       *
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawLeftBottomTriangle(int length) {
        // TODO : complete the method
        for (int i = length; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *
     *       * * * *
     *         * * *
     *           * *
     *             *
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawRightBottomTriangle(int length) {
        // TODO : complete the method
        for (int i = length; i >= 1; i--) {
            for (int j = length; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /**
     * Draws the rhombus by specified length number
     * for example when n = 5 , it must be such as
     * drawn below :
     *
     *        *
     *       * *
     *      * * *
     *     * * * *
     *      * * *
     *       * *
     *        *
     * @param length  specified length of rhombus will be drawn
     */
    public static void drawRhombus(int length) {
        // TODO : complete the method
        for (int i = length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= length - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = length; i >= 1; i--) {
            for (int j = length; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /**
     * length = 5
     *            *
     *          * * *
     *        * * * * *
     *      * * * * * * *
     *    * * * * * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawIsoscelesTriangle(int length) {
        for (int i = length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= length - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /**
     *
     *   * * * * * * * * *
     *     * * * * * * *
     *       * * * * *
     *         * * *
     *           *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawBottomIsoscelesTriangle(int length) {
        for (int i = length; i >= 1; i--) {
            for (int j = length; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
