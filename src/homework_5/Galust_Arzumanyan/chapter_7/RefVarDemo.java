package homework_5.Galust_Arzumanyan.chapter_7;


// This method is used to demonstrate local variable type inference with a user_defined class type
class RefVarDemo {
    public static void main(String[] args) {
        var mc = new MyClass(10);
        System.out.println(" Value of i in mc is: " + mc.geti());
        mc.seti(19);
        System.out.println(" Value of i in mc is now: " + mc.geti());
    }
}
