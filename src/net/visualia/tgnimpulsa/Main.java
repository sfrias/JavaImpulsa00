package net.visualia.tgnimpulsa;

public class Main {

    public static void main(String[] args) {
        DoG doggy = new DoG();
        doggy.setName("Rayo");
        doggy.setOwnerName("Nubarrón");
        doggy.setSkinColor("Blanco");

        System.out.println("Birth:"+doggy.getBirthDate());
        System.out.println("Name:"+doggy.getName());
        System.out.println("Owner:"+doggy.getOwnerName());
        System.out.println("ColorPelo:"+doggy.getSkinColor());
        System.out.println("")
    }
}
