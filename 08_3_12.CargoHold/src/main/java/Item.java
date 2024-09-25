public class Item {

    private int weight;
    private String name;

    public Item(String name, int weight) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + weight + " kg)";
    }
}
