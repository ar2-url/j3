public class Cat2 {

    private String name;
    private double weight;
    private String ownerName;

    public Cat2(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    // -----------------------------------------------
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void feed() {
        System.out.println("Cat: " + name);
    }

    public void scratch() {
        System.out.println("Mrrrr mrrrr" + name);
    }

    @Override                   // override change 
    public String toString() {
        return name + " " + weight + " " + ownerName;
    }
}
