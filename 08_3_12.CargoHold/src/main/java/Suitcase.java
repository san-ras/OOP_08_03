import java.util.ArrayList;
import java.util.Comparator;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }

    public void printItems() {
        items.forEach(System.out::println);
    }

    public int totalWeight() {
        return items.stream().mapToInt(Item::getWeight).sum();
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        return items.stream().max(Comparator.comparingInt(Item::getWeight)).get();
    }

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        return items.size() + (items.size() > 1 ? " items (" : " item (") + totalWeight() + " kg)";
    }
}
