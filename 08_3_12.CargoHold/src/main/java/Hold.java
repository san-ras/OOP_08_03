import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcases.stream().mapToInt(Suitcase::totalWeight).sum() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    public void printItems() {
        suitcases.forEach(Suitcase::printItems);
    }

    @Override
    public String toString() {
        if (suitcases.isEmpty()) {
            return "no items (0 kg)";
        }
        return suitcases.size() + " suitcases (" + suitcases.stream().mapToInt(Suitcase::totalWeight).sum() + " kg)";
    }


}
