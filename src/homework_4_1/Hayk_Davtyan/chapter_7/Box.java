package homework_4_1.Hayk_Davtyan.chapter_7;

public class Box {
    double width;
    double height;
    double depth;
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double len){
        width = height = depth = len;
    }
    double volume(){
        return width * height * depth;
    }
}
