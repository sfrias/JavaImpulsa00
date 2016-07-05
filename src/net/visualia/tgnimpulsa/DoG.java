package net.visualia.tgnimpulsa;

/**
 * Created by sfrias on 05/07/2016.
 */

public class DoG {
    private String Name;
    private String ownerName;
    private String skinColor;
    private long birthDate;
    private int plateNumber;
    private float weight;

    public DoG() {
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getSkinColor() {
        return this.skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public long getBirthDate() {
        return 10L;
    }

    public int getPlateNumber() {
        return this.plateNumber;
    }

    public void setPlateNumber(int plateNumber) {
        this.plateNumber = plateNumber;
    }
}