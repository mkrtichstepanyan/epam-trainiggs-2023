package homework_8.araksya_ghazaryan.chapter_9.p1;

class SamePackage {
    SamePackage(){
        Protection p = new Protection();
        System.out.println(" same derived constractor");
        System.out.println("n " + p.n);

        System.out.println("n_pro " + p.n_pro );
        System.out.println("n_pub " + p.n_pub );
    }
}