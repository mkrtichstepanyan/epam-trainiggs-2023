package homework_4_1.Hayk_Davtyan.chapter_7;

public class Factorial {
    int fact (int n){
        int result;
        if (n==1) return  1;
        result = fact(n-1) * n;
        return result;
    }
}
