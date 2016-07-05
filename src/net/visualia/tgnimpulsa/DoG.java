package net.visualia.tgnimpulsa;


/**
 * Created by sfrias on 05/07/2016.
 */

class DoG {
    private String Name;
    private String ownerName;
    private String skinColor;
    private long birthDate;
    private int plateNumber;
    private float weight;

    public DoG() {
        setName("Rayo");
        setOwnerName("Nubarrón");
        setSkinColor("Blanco");
        setBirthDate(4594964L);
        setPlateNumber(15784);
        setWeight(5.64f);
    }

    public DoG(String name,
               String ownerName,
               String skinColor,
               long birthDate,
               int plateNumber,
               float weight) {
        Name = name;
        this.ownerName = ownerName;
        this.skinColor = skinColor;
        this.birthDate = birthDate;
        this.plateNumber = plateNumber;
        this.weight = weight;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
    }

    public int getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(int plateNumber) {
        this.plateNumber = plateNumber;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void ListSpecimen(DoG specimen){
        System.out.println("Birth:"+specimen.getBirthDate());
        System.out.println("Name:"+specimen.getName());
        System.out.println("Owner:"+specimen.getOwnerName());
        System.out.println("ColorPelo:"+specimen.getSkinColor());
        System.out.println("Fecha Nacimiento:"+specimen.getBirthDate());
        System.out.println("Matrícula:"+specimen.getPlateNumber());
        System.out.println("Peso:"+specimen.getWeight());
        System.out.println("----------------------");
    }
}