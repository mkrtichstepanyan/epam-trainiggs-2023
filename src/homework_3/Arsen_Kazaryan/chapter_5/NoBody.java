package homework_3.Arsen_Kazaryan.chapter_5;

public class NoBody {
    public static void main(String[] args) {
        int i, j;

        i = 100;
        j = 200;
        while (++i < --j) ;
        System.out.println(" Средняя точка равна " + i);
    }
}
