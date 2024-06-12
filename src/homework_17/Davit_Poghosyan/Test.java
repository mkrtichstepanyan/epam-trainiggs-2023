package homework_17.Davit_Poghosyan;

public class Test {
    public static void main(String[] args) {
        GenericLinkedList linkedList = new GenericLinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.remove("C");
        for (int i = 0; i < linkedList.size(); i++){
            System.out.println(linkedList.get(i));
        }
    }
}
