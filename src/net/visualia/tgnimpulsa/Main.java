package net.visualia.tgnimpulsa;

public class Main {

    public static void main(String[] args) {
        DoG doggy = new DoG();


        System.out.println("Birth:"+doggy.getBirthDate());
        System.out.println("Name:"+doggy.getName());
        System.out.println("Owner:"+doggy.getOwnerName());
        System.out.println("ColorPelo:"+doggy.getSkinColor());
        System.out.println("Fecha Nacimiento:"+doggy.getBirthDate());
        System.out.println("Matrícula:"+doggy.getPlateNumber());
        System.out.println("Peso:"+doggy.getWeight());
    }
}
