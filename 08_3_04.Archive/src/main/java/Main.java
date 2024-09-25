
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArchiveItem> items = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            ArchiveItem item = new ArchiveItem(name, identifier);
            boolean isAdded = false;

            if (items.isEmpty()) {
                items.add(item);
            } else {
                for (ArchiveItem value : items) {
                    if (value.equals(item)) {
                        isAdded = true;
                    }
                }
                if (!isAdded) {
                    items.add(item);
                }
            }
        }
        for (ArchiveItem value : items) {
            System.out.println(value.toString());
        }
    }
}