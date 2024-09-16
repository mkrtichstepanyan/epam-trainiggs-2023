package homework_19.Anush_Ananyan.LambdaExpression;

public class MyClassGen <T>{
    private  T val;

     MyClassGen(T v) {
        val = v;
    }
    MyClassGen() {
        val = null;
    }
    T getVal(){
         return  val;
    }
}
