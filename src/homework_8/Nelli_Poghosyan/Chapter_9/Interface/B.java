package homework_8.Nelli_Poghosyan.Chapter_9.Interface;

class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }

}
