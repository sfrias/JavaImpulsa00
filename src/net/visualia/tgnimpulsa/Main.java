package net.visualia.tgnimpulsa;

public class Main {

    public static void main(String[] args) {
        DoG doggy = new DoG();
        System.out.println("Creacion objeto genérico");
        doggy.ListSpecimen(doggy);

        DoG doggy2 = new DoG("Lasie","Tomás","Verde",
                2850548L,1234,45.6f);
        System.out.println("Creacion objeto específico");
        doggy2.ListSpecimen(doggy2);
    }
}
